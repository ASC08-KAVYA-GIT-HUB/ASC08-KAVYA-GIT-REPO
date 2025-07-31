package org.example.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FriendDbConnection {
    private static   Connection connection = null;
    public static Connection getInstance() {
    if (connection == null) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver loaded!");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=FriendApp_db;user=sa;password=sqlserver;trustServerCertificate=true;";
            connection = DriverManager.getConnection(url);
            System.out.println("Connection established!!!");

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
              e.printStackTrace();
        }

    }
    return connection;

}
}

