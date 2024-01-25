package com.learnSpringBoot.store.dao;

import com.learnSpringBoot.store.entity.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderStatusRepository extends JpaRepository<OrderStatus,Integer> {
}
