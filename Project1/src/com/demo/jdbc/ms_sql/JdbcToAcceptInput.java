package com.demo.jdbc;
import java.sql.*;
import java.util.Scanner;
import java.util.Scanner;

public class JdbcToAcceptInput {
    public  static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Connection conn = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=myfriends_db;user=sa;password=sqlserver;trustServerCertificate=true;";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection established!!!");
            System.out.print("Enter user id: ");
            int user_id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter email: ");
            String email = sc.nextLine();

            System.out.print("Enter the last name: ");
            String last_name = sc.nextLine();

            String insertQuery="INSERT INTO myTable(user_id,email,last_name) values (?,?,?)";
            PreparedStatement preparedStatement=conn.prepareStatement(insertQuery);
//            preparedStatement=conn.prepareStatement(insertQuery);
            preparedStatement.setInt(1,user_id);
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,last_name);
            int rowsInserted = preparedStatement.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");
            // Loop to insert 100 additional rows
            for (int i = 30; i <= 40; i++) {
                int newUserId = user_id + i;
                String generatedEmail = "user" + newUserId + "@example.com";
                String generatedLastName = last_name + i;

                preparedStatement.setInt(1, newUserId);
                preparedStatement.setString(2, generatedEmail);
                preparedStatement.setString(3, generatedLastName);

                preparedStatement.executeUpdate();
            }

            System.out.println("100 additional rows inserted with auto-generated IDs.");



            //PreparedStatement used to execute parameterised sql queries
           // int res= preparedStatement.executeUpdate(insertQuery);
          //  System.out.println(res+"row(s) updated");

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
