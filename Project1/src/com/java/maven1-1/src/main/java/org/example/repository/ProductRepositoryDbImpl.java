package org.example.repository;

import org.example.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.sql.Statement;
import java.util.Collections;
import java.util.List;

public class ProductRepositoryDbImpl implements ProductRepository {
    @Override
    public boolean addProductToCart(Product product) {
        try {
            Connection connection = getConnection();
            System.out.println("Driver Loaded!");
            Statement statement = connection.createStatement();
            System.out.println("Statement Created");
            String insertQuery = "INSERT INTO product (id,name,price,quantity) values('" + product.getId()
                    + "''" + product.getName() + "'," + product.getPrice() + "," + product.getQuantity() + ");";
            int noOfRows = statement.executeUpdate(insertQuery);
            System.out.println("no of rows affected" + noOfRows);
            return noOfRows > 0;

        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        }
        return false;
    }

    private static Connection getConnection() {
        return DbConnectionSingleton.getInstance();
    }


    @Override
    public List<Product> getAllProducts() {
        //return Collections.emptyList();
        List<Product> products = new ArrayList<>();
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM product");
            while (resultSet.next()) {

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return products;
    }
}






