package com.learnSpringBoot.store.rest;

import com.learnSpringBoot.store.dao.OrderRepository;
import com.learnSpringBoot.store.entity.Customer;
import com.learnSpringBoot.store.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderRestController {

    private OrderRepository orderRepository;
    @Autowired
    public OrderRestController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void getOrder(){
        Optional<Order> or= orderRepository.findById(1);
        or.get();
    }
    @GetMapping("/ordersCustomer/{customerId}")
    public Customer getOrderedCustomer(@PathVariable("customerId") int id){
        Optional<Customer> clist = orderRepository.getOrderedCustomer(id);

        return clist.get();
    }

    @GetMapping("/order-customer")
    public List<Order> getOrderAndCustomer(){
        return orderRepository.findAll();
    }
}
