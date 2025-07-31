package com.demo.jdbc;
import java.sql.*;

public class JDBCSelectStatement {
    public static void main(String args[]) {
        Connection connection=null ;
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver loaded!");
            String url="jdbc:sqlserver://localhost:1433;databaseName=myfriends_db;user=sa;password=sqlserver;trustServerCertificate=true;";
            connection=DriverManager.getConnection(url);
            System.out.println("Connection established!!!");
            Statement statement=connection.createStatement();
            System.out.println("statement created");
            ResultSet resultSet=statement.executeQuery("SELECT * FROM myTbale");


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
