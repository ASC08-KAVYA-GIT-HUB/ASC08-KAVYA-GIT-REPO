package com.demo.jdbc.ms_sql;
import java.sql.*;

import java.sql.Connection;
import java.util.Scanner;

public class JdbcToDelete {
    public static void main(String args[])
    {
        Connection connection=null;
        Scanner sc=new Scanner(System.in);
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=myfriends_db;user=sa;password=sqlserver;trustServerCertificate=true;";
            connection = DriverManager.getConnection(url);
            System.out.println("Connection established!!!");
            System.out.println("enter the user id u want to delete:");
            int user_id=sc.nextInt();
            String deleteQuery="DELETE FROM myTable where user_id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(deleteQuery);
            preparedStatement.setInt(1,user_id);
            int rowsdeleted= preparedStatement.executeUpdate();
            System.out.println(rowsdeleted+"rows deleted");

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
