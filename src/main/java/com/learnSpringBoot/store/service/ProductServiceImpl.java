package com.learnSpringBoot.store.service;

import com.learnSpringBoot.store.dao.ProductDAO;
import com.learnSpringBoot.store.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductDAO productDAO;
    @Autowired
    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Product findById(int id) {
        return productDAO.findById(id);
    }

    @Override
    @Transactional
    public Product save(Product product) {
        return productDAO.save(product);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        productDAO.delete(id);
    }
}
