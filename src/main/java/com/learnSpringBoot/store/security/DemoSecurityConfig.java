package com.learnSpringBoot.store.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class DemoSecurityConfig {

    // Add support for JDBC

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
    }



    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(configurer ->
                configurer.requestMatchers(HttpMethod.GET,"/**").
                        hasAnyRole("EMPLOYEE","MANAGER","ADMIN")
                        .requestMatchers(HttpMethod.GET,"/products/**").
                        hasAnyRole("EMPLOYEE","MANAGER","ADMIN")
                        .requestMatchers(HttpMethod.POST,"/**").
                        hasAnyRole("MANAGER","ADMIN")
                        .requestMatchers(HttpMethod.PUT,"/products/**").
                        hasAnyRole("MANAGER","ADMIN")
                        .requestMatchers(HttpMethod.DELETE,"/products/**").
                        hasAnyRole("ADMIN")

                );
        // use http basic auth
        http.httpBasic(Customizer.withDefaults());

        // disable csrf cross site request forgery

        http.csrf(csrf -> csrf.disable());

        return http.build();
    }

    /*@Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails john = User.builder()
                .username("john")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails mary = User.builder()
                .username("mary")
                .password("{noop}test123")
                .roles("EMPLOYEE","MANAGER")
                .build();

        UserDetails susan = User.builder()
                .username("susan")
                .password("{noop}test123")
                .roles("EMPLOYEE","MANAGER","ADMIN")
                .build();

        return new InMemoryUserDetailsManager(john,mary,susan);
    }*/
}
