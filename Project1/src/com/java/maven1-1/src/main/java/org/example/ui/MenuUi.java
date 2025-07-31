package org.example.ui;
import org.example.model.Product;
import org.example.services.ProductServiceImpl;
import org.example.services.ProductServices;
import java.util.List;

public class MenuUi {
    ProductServices productService = new ProductServiceImpl();

    void accessMenu() {
        System.out.println("Welcome to Ecommmerce App!!");
        System.out.println("1. Add Product");
        System.out.println("2. View Products");
        System.out.println("3. Update Product");
        System.out.println("4. Delete Product");
        System.out.println("5. Exit");
    }

    void addProduct() {
        Product product = new Product("1", "laptop", "123", 1100);

        boolean isAdded = productService.addProduct(product);

        if(isAdded) {
            System.out.println("Product added successfully");
        }else {
            System.out.println("Product not added");
        }
    }

    void getAllProducts() {
        List<Product> productList = productService.getAllProducts();

        for(Product product : productList) {
            System.out.println(product);
        }
    }

    void updateProduct() {
        Product product = new Product("1", "laptop", "123", 9000);

        boolean isAdded = productService.addProduct(product);

        if(isAdded) {
            System.out.println("Product updated successfully");
        }else {
            System.out.println("Product not updated");
        }

    }

}


