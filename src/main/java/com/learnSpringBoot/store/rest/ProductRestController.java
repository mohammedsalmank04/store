package com.learnSpringBoot.store.rest;

import com.learnSpringBoot.store.dao.ProductDAO;
import com.learnSpringBoot.store.dao.ProductRepository;
import com.learnSpringBoot.store.entity.Product;
import com.learnSpringBoot.store.exception.ProductErrorResponse;
import com.learnSpringBoot.store.exception.ProductNotFoundException;
import com.learnSpringBoot.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.sound.sampled.Port;
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







