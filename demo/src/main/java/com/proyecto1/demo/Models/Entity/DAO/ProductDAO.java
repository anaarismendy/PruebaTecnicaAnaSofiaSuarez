package com.proyecto1.demo.Models.Entity.DAO;

import java.util.List;

import com.proyecto1.demo.Models.Entity.Product;

public interface ProductDAO {

    List<Product> findAll();
    Product findById(Long id);
    void save(Product product);
    void update(long id, Product product);
    void delete(Long id);
}
