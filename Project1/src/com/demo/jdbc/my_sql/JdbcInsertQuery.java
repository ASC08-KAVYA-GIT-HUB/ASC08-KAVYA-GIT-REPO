package com.demo.jdbc.my_sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertQuery {

        public static void main(String[] args) {
            Connection connection = null;
            try {
                     Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded!");

            // Use Windows Authentication
//            String url = "jdbc:sqlserver://localhost:1433;databaseName=TestDB;integratedSecurity=true;";
//            String url = "jdbc:sqlserver://localhost:1433;databaseName=TestDB;user=sa;password=sqlserver;";
            String url = "jdbc:mysql://localhost:3306/testdb?user=root&password=mysql";
                connection = DriverManager.getConnection(url);
                System.out.println("Connection established!");

                Statement statement = connection.createStatement();
                System.out.println("Statement created");

              //  String insertQuery = "INSERT INTO myTable (user_id, email, last_name) VALUES (101, 'newuser@example.com', 'Doe')";
                // int rowsInserted = statement.executeUpdate(insertQuery);
                String insertQuery2="insert into myTable (user_id,email, last_name) VALUES (102, 'user123@example.com', 'Doee')";
                int rowsInserted1 = statement.executeUpdate(insertQuery2);
                System.out.println(rowsInserted1 + " row(s) inserted.");

            } catch (Exception e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            } finally {
                try {
                    if (connection != null && !connection.isClosed()) {
                        connection.close();
                        System.out.println("Connection closed.");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

