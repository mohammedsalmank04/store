package com.learnSpringBoot.store.dao;

import com.learnSpringBoot.store.entity.OrderItemNote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemNoteRepository extends JpaRepository<OrderItemNote,Integer> {
}
