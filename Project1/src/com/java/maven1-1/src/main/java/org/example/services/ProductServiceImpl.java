package org.example.services;
import java.util.*;
import org.example.repository.ProductRepositoryCollectionImpl;
import org.example.repository.*;

import org.example.model.Product;

public class ProductServiceImpl implements ProductServices {

        //A service is a class that provides business logic to the application.
        ProductRepository productRepository = new ProductRepositoryCollectionImpl();
        public boolean addProduct(Product product) {
            boolean isAdded = false;
            if (product.getPrice()<0) {
                System.out.println("Price cannot be negative");
            } else {
                isAdded =  productRepository.addProductToCart(product);
            }
            return isAdded;
        }
        // get all products
        public List<Product> getAllProducts() {

            return productRepository.getAllProducts();
        }
        @Override
        public boolean updateProduct(Product product)
        {
            throw new UnsupportedOperationException("not implemented yet");
        }
    }

