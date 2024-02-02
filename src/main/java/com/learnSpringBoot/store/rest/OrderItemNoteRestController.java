package com.learnSpringBoot.store.rest;

import com.learnSpringBoot.store.dao.OrderItemNoteRepository;
import com.learnSpringBoot.store.dao.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderItemNoteRestController {

    private OrderItemNoteRepository orderItemNoteRepository;
    @Autowired
    public OrderItemNoteRestController(OrderItemNoteRepository orderItemNoteRepository) {
        this.orderItemNoteRepository = orderItemNoteRepository;
    }
}
