package com.company;

import com.company.gui.CreateStudentFrame;
import com.company.repository.DBSetup;
import com.company.repository.StudentRepository;
import com.company.service.StudentService;

public class Main {

    public static void main(String[] args) {

        new CreateStudentFrame();
        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService(studentRepository);
        DBSetup dbSetup = new DBSetup();

//        StudentRepository studentRepository = new StudentRepository();
//        StudentService studentService = new StudentService(studentRepository);
//        DBSetup dbSetup = new DBSetup(Constants.JDBC_URL, Constants.POSTGRES_USERNAME, Constants.POSTGRES_PASSWORD);
//        dbSetup.initConnection();
//
//        studentService.deleteStudent(dbSetup.connection, "103");
    }
}

