package org.example.repository;
import org.example.model.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryCollectionImpl implements ProductRepository {

        //A repository is a class that provides CRUD operations on the model.
        Map<String, Product> cart = new HashMap<String, Product>();
        public boolean addProductToCart(Product product) {
            cart.put(product.getId(),product);
//        System.out.println("Product added to cart " );
            System.out.println("Updated cart is " + cart);
            return true;
        }

        @Override
        public List<Product> getAllProducts() {
            throw new UnsupportedOperationException("Not implemented yet");

        }
    }

