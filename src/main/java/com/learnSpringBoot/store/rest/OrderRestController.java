package com.learnSpringBoot.store.rest;

import com.learnSpringBoot.store.dao.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestController {

    private OrderRepository orderRepository;
    @Autowired
    public OrderRestController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}
