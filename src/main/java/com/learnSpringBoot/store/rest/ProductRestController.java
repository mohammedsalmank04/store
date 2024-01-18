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
@RequestMapping("/api")
public class ProductRestController {

    private ProductService productService;

    @Autowired
    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        List<Product> theProducts = productService.findAll();

        return theProducts;
    }

    @GetMapping("/products/{productId}")
    public Product getProduct(@PathVariable int productId){

        return productService.findById(productId);
    }

    // Add mapping to add a new product

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        product.setId(0);

        Product dbProduct = productService.save(product);

        return dbProduct;
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product){
        Product dbProduct =productService.save(product);
        return dbProduct;
    }

    @DeleteMapping("/products/{productId}")
    public String deleteProduct(@PathVariable int productId){
        Product tempProduct = productService.findById(productId);
        if(tempProduct == null){
            throw  new RuntimeException("Employee not found");
        }
        productService.delete(productId);
        return "Deleted Employee id";
    }

}

    // Add an exception handler







