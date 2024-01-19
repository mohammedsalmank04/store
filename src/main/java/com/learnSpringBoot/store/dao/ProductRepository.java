package com.learnSpringBoot.store.dao;

import com.learnSpringBoot.store.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> ,CustomizedProductRepository {
    @RestResource(path = "productCount", rel = "customMethods")
    long getProductCount();

    @Query("SELECT p from Product p where p.quantityInStock < ?1")
    List<Product> getLessStockProduct(Integer quantity);

    @Query("SELECT SUM(unitPrice) FROM Product")
    double getSumOfPrice();
    @Query("SELECT SUM(quantityInStock) FROM Product")
    double getTotalQuantity();
}
