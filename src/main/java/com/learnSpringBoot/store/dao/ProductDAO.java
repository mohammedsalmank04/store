package com.learnSpringBoot.store.dao;

import com.learnSpringBoot.store.entity.Product;

import java.util.List;

public interface ProductDAO {

    Product save(Product product);

    Product findById(int id);

    List<Product> findAll();

    List<Product> findByName(String name);





    void delete(Integer id);

    int getSize();


}
