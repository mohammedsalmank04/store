package com.learnSpringBoot.store.service;

import com.learnSpringBoot.store.dao.ProductDAO;
import com.learnSpringBoot.store.dao.productRepository;
import com.learnSpringBoot.store.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private productRepository productRepository;
    @Autowired
    public ProductServiceImpl(com.learnSpringBoot.store.dao.productRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        Optional<Product> result = productRepository.findById(id);
        if(result.isPresent()){
            return result.get();
        }else{
            throw new RuntimeException("Did not find Product");
        }

    }

    @Override

    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override

    public void deleteById(int id) {
        productRepository.deleteById(id);
    }
}
