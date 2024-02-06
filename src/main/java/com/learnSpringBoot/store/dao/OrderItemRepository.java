package com.learnSpringBoot.store.dao;

import com.learnSpringBoot.store.entity.OrderItem;
import com.learnSpringBoot.store.entity.OrderItemId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemId> {
}
