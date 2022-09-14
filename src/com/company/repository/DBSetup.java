package com.company.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBSetup {

    private static final String
            createStudentTableStatement = "CREATE TABLE IF NOT EXISTS public.students\n" +
            "(\n" +
            "    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 100 MINVALUE 100 MAXVALUE 999 CACHE 1 ),\n" +
            "    first_name text COLLATE pg_catalog.\"default\" NOT NULL,\n" +
            "    last_name text COLLATE pg_catalog.\"default\" NOT NULL,\n" +
            "    email text COLLATE pg_catalog.\"default\" NOT NULL,\n" +
            "    password text COLLATE pg_catalog.\"default\" NOT NULL,\n" +
            "    CONSTRAINT students_pkey PRIMARY KEY (id)\n" +
            ")";

    public Connection connection;

    private final String jdbcURL = "jdbc:postgresql://localhost:5432/certificate";
    private final String username = "postgres";
    private final String password = "tudorparola";

    public DBSetup() {

        initConnection();
    }

    public void initConnection() {

        try {
            this.connection = DriverManager.getConnection(jdbcURL, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println(throwables.getMessage());
        }
    }

    public void initStudentTable() {

        try {
            PreparedStatement statement = connection.prepareStatement(createStudentTableStatement);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
