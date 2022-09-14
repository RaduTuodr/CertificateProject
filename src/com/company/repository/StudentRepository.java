package com.company.repository;

import com.company.model.Student;
import org.jetbrains.annotations.NotNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentRepository {

    private static final String addStudentSQLStatement = "INSERT INTO students(first_name, last_name, email, password) VALUES (?, ?, ?, ?)";
    private static final String deleteStudentSQLStatement = "DELETE FROM students WHERE id = ";

    public void closeProcess(Connection connection, PreparedStatement statement) throws SQLException {

        statement.close();
        connection.close();
    }

    public void addStudent(Connection connection, @NotNull Student student) throws SQLException {

        PreparedStatement st = connection.prepareStatement(addStudentSQLStatement);
        st.setString(1, student.getFirstName());
        st.setString(2, student.getLastName());
        st.setString(3, student.getEmail());
        st.setString(4, student.getPassword());
        st.executeUpdate();

        this.closeProcess(connection, st);
    }

    public void deleteStudent(Connection connection, @NotNull String id) throws SQLException {

        PreparedStatement st = connection.prepareStatement(deleteStudentSQLStatement + id);
        st.executeUpdate();

        this.closeProcess(connection, st);
    }
}
