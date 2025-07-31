package org.example.repository;

import org.example.model.Product;

import java.util.List;

public interface ProductRepository {

        boolean addProductToCart(Product product);
        List<Product> getAllProducts();

    }

