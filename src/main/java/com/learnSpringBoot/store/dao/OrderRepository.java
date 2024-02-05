package com.learnSpringBoot.store.dao;

import com.learnSpringBoot.store.entity.Customer;
import com.learnSpringBoot.store.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order,Integer> {
    @Query("SELECT c FROM Customer c WHERE c.id = :customerId")
    Optional<Customer> getOrderedCustomer(@Param("customerId") Integer id);
    @Query("SELECT o from Order o ")
    List<Order> getOrderAndCustomer();


}
