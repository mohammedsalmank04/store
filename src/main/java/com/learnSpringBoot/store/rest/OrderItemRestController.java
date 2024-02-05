package com.learnSpringBoot.store.rest;

import com.learnSpringBoot.store.dao.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderItemRestController {

    private OrderItemRepository orderItemRepository;
    @Autowired
    public OrderItemRestController(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }
}
