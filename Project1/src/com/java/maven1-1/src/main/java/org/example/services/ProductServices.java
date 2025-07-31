package org.example.services;

import org.example.model.Product;

import java.util.List;

public interface ProductServices {

        public boolean addProduct(Product product);
        public List<Product> getAllProducts();
    boolean updateProduct(Product product);
    }