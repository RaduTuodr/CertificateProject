package com.company.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBSetup {

    public Connection connection;

    private String jdbcURL = "jdbc:postgresql://localhost:5432/certificate";
    private String username = "postgres";
    private String password = "tudorparola";

    public DBSetup(String jdbcURL, String username, String password) {

        this.jdbcURL = jdbcURL;
        this.username = username;
        this.password = password;
    }

    public void initConnection() {

        try {
            this.connection = DriverManager.getConnection(jdbcURL, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println(throwables.getMessage());
        }
    }
}
