package com.proyecto1.demo.Models.Entity.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.proyecto1.demo.Models.Entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class ProductDAOImp implements ProductDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> findAll() {
    return entityManager.createQuery("SELECT p FROM Product p", Product.class)
            .getResultList();
        }

    @Override
    public Product findById(Long id) {
        return entityManager.find(Product.class, id);
    }

    @Transactional
    @Override
    public void save(Product product) {
        entityManager.persist(product);
    }

    @Transactional
    @Override
    public void update(long id, Product product) {
        entityManager.merge(product);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        Product product = findById(id);
        if (product != null) {
            entityManager.remove(product);
        }
    }
}
