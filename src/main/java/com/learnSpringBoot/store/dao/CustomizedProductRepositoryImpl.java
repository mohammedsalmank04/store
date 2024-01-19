package com.learnSpringBoot.store.dao;

import com.learnSpringBoot.store.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomizedProductRepositoryImpl implements CustomizedProductRepository {

    private EntityManager entityManager;
    @Autowired
    public CustomizedProductRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public long getProductCount() {
        Query query = entityManager.createQuery("SELECT COUNT(*) FROM Product");


        return (long) query.getSingleResult();
    }

    @Override
    public List<Product> lessQuantity() {

        Query query = entityManager.createQuery("SELECT * FROM Product WHERE quantityInStock < 50");
        return null;
    }
}
