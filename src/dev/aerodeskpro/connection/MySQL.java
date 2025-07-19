/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.aerodeskpro.connection;


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import java.sql.SQLException; 
public class MySQL {

    private static final String DATABASE = "aerodeskpro";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";
    private static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/" + DATABASE,
                    USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet executeSearch(String query) throws SQLException {
        return connection.createStatement().executeQuery(query);
    }

    public static void executeIUD(String query) {
        try {
            connection.createStatement().executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet execute(String query) throws SQLException {
        Statement smt;
        if (query.startsWith("SELECT")) {
            smt = connection.createStatement();
            ResultSet rs = smt.executeQuery(query);
            return rs;
        } else {
            smt = connection.createStatement();
            smt.executeQuery(query);
            return null;
        }
    }
}
