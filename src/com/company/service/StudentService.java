package com.company.service;

import com.company.model.Student;
import com.company.repository.StudentRepository;

import java.sql.Connection;
import java.sql.SQLException;

public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {

        this.studentRepository = studentRepository;
    }

    public void addStudent(Connection connection, String first_name, String last_name, String email) {

        Student student = new Student(
                "",
                first_name,
                last_name,
                email
        );
        try {
            this.studentRepository.addStudent(connection, student);
        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
        }
    }

    public void deleteStudent(Connection connection, String ID) {

        try {
            this.studentRepository.deleteStudent(connection, ID);
        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
        }
    }
}
