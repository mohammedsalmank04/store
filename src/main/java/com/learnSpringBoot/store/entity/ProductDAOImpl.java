package com.learnSpringBoot.store.entity;

import com.learnSpringBoot.store.dao.ProductDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {

    private EntityManager entityManager;
    @Autowired
    public ProductDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Product product) {
        entityManager.persist(product);
    }

    @Override
    public Product findById(int id) {
        return entityManager.find(Product.class,id);
    }

    @Override
    public List<Product> findAll() {
        TypedQuery<Product> theQuery =
                entityManager.createQuery("FROM Product",Product.class);
        return theQuery.getResultList();
    }

    @Override
    public List<Product> findByName(String nameReceived) {
        TypedQuery<Product> theQuery =
                entityManager.createQuery("from Product where name=:theName",Product.class);
        theQuery.setParameter("theName",nameReceived);

        return theQuery.getResultList();
    }
    @Transactional
    @Override
    public void update(Product product) {
        entityManager.merge(product);
    }

    @Override
    @Transactional
    public void updateName(Product product) {
        entityManager.merge(product);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Product tempProduct = findById(id);
        entityManager.remove(tempProduct);

    }

    @Override
    public int getSize() {
        List<Product> productList = findAll();
        return productList.size();
    }
}
