package com.sales.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

    public static Connection getConnection() {
        Connection con = null;

        try {
                     
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/salesdb",
                "root",
                "2643889"  
            );


        } catch(Exception e) {
            System.out.println("Connection Failed ❌");
            e.printStackTrace();
        }

        return con;
    }
}