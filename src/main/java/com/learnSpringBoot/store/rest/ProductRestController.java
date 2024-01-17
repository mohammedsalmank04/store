package com.learnSpringBoot.store.rest;

import com.learnSpringBoot.store.dao.ProductDAO;
import com.learnSpringBoot.store.entity.Product;
import com.learnSpringBoot.store.exception.ProductErrorResponse;
import com.learnSpringBoot.store.exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {
    private ProductDAO productDAO;
    @Autowired
    public ProductRestController(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        List<Product> theProducts = productDAO.findAll();

        return theProducts;
    }

    @GetMapping("/products/{productId}")
    public Product getProduct(@PathVariable int productId){
        int countOfProduct = productDAO.getSize();

        if(productId > countOfProduct || productId <= 0){
            throw new ProductNotFoundException("Product not found- "+ productId);
        }
        return productDAO.findById(productId);
    }

    // Add an exception handler





    @GetMapping("/products/getCount")
    public int getCountDemo(){
        return productDAO.getSize();
    }
}
