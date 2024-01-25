package com.learnSpringBoot.store.rest;

import com.learnSpringBoot.store.dao.OrderStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderStatusController {

    private OrderStatusRepository orderStatusesRepository;
    @Autowired
    public OrderStatusController(OrderStatusRepository orderStatusesRepository) {
        this.orderStatusesRepository = orderStatusesRepository;
    }

    @RequestMapping("/o")
    public String hello(){
        return "hello";
    }
}
