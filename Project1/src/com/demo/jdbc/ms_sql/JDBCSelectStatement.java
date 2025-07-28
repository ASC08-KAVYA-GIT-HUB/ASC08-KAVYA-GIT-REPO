package com.demo.jdbc.ms_sql;
import java.sql.*;

public class JDBCSelectStatement {
    public static void main(String args[]) {
        Connection connection=null ;
        try {
            //load the jdbc , establish connection ,create statement,resultset to print the results
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver loaded!");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=myfriends_db;user=sa;password=sqlserver;trustServerCertificate=true;";
            connection = DriverManager.getConnection(url);
            System.out.println("Connection established!!!");
            Statement statement = connection.createStatement();
            System.out.println("statement created");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM myTable");
            System.out.println("Result sets");
            //System.out.println("userID");
//            resultSet.next();
//            int user_id=resultSet.getInt("user_id");
//            System.out.println("user id "+user_id);
//            String email=resultSet.getString("email");
//            System.out.println("email "+email);
//            String last_name=resultSet.getString(3);
//            System.out.println("last Name "+last_name);

            while (resultSet.next()) {
                System.out.println("User ID: " + resultSet.getInt("user_id"));
                System.out.println("Email: " + resultSet.getString("email"));
                System.out.println("Last Name: " + resultSet.getString("last_name"));
                System.out.println("********");
            }

        }

        catch(ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }

    }



}
