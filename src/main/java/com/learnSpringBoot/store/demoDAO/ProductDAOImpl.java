package com.learnSpringBoot.store.demoDAO;

import com.learnSpringBoot.store.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {

    private EntityManager entityManager;
    @Autowired
    public ProductDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override

    public Product save(Product product) {
        Product dbProduct = entityManager.merge(product);
        return  dbProduct;
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




    @Override

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
