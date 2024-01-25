package com.learnSpringBoot.store.rest;

import com.learnSpringBoot.store.dao.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerRestController {

    private CustomerRepository customerRepository;
    @Autowired
    public CustomerRestController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
