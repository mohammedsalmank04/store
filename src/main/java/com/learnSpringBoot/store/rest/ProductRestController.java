package com.learnSpringBoot.store.rest;

import com.learnSpringBoot.store.dao.ProductRepository;
import com.learnSpringBoot.store.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductRestController {

    private ProductRepository productRepository;
    @Autowired
    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @GetMapping("/getCount")
    public List<Product> getCount(@RequestBody Product product){
        int quantity = product.getQuantityInStock();
        return productRepository.getLessStockProduct(quantity);
    }

    @GetMapping("/sum")
    public double getSum(){
        return productRepository.getSumOfPrice();
    }

    @GetMapping("/quantity")
    public double quantity(){
        return productRepository.getTotalQuantity();
    }
}

    // Add an exception handler







