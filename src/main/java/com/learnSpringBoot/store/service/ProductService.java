package com.learnSpringBoot.store.service;

import com.learnSpringBoot.store.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(int id);

    Product save(Product product);

    void deleteById(int id);




}
