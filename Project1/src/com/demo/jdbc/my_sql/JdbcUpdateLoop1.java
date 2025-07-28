package com.demo.jdbc.my_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcUpdateLoop1 {
    public static void main(String args[])
    {
        Connection conn=null;
        Scanner sc=new Scanner(System.in);
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=myfriends_db;user=sa;password=sqlserver;trustServerCertificate=true;";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection established!!!");

            System.out.print("Enter user id to update: ");
            int user_id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter the  new last name: ");
            String last_name = sc.nextLine();

            String updateQuery="UPDATE myTable set last_name=? where user_id=?";
            PreparedStatement preparedStatement = conn.prepareStatement(updateQuery);
            preparedStatement.setString(1, last_name);
            preparedStatement.setInt(2, user_id);

            int rowsUpdated = preparedStatement.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");
        }
        catch(ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch(SQLException e)
        {

            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

}

