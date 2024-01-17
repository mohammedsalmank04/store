package com.learnSpringBoot.store.dao;

import com.learnSpringBoot.store.entity.Product;

import java.util.List;

public interface ProductDAO {

    void save(Product product);

    Product findById(int id);

    List<Product> findAll();

    List<Product> findByName(String name);

    void update(Product product);

    void updateName(Product product );

    void delete(Integer id);

    int getSize();
}
