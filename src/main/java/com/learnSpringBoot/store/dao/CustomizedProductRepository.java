package com.learnSpringBoot.store.dao;

import com.learnSpringBoot.store.entity.Product;

import java.util.List;

public interface CustomizedProductRepository {

    long getProductCount();

    List<Product> lessQuantity();
}
