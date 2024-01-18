package com.learnSpringBoot.store.dao;

import com.learnSpringBoot.store.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<Product, Integer> {
}
