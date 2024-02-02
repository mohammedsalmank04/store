package com.learnSpringBoot.store.dao;

import com.learnSpringBoot.store.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
