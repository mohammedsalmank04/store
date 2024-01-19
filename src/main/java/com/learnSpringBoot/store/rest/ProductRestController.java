package com.learnSpringBoot.store.rest;

import com.learnSpringBoot.store.dao.ProductDAO;
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

public class ProductRestController {

    private ProductService productService;

    @Autowired
    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }



}

    // Add an exception handler







