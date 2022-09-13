package com.company.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class CreateStudentFrame {

    JFrame frame;
    JPanel panel;

    JLabel firstNameText, lastNameText,
            emailText, passwordText;
    JTextField firstNameField, lastNameField, emailField;
    JPasswordField passwordField;
    JButton createButton,
            clearButton;

    public CreateStudentFrame() {

        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setFrameArgs(frame);

        initComponents();
        placeComponents(panel);

        frame.add(panel);
        frame.setVisible(true);
    }

    private void setFrameArgs(Frame frame) {


        frame.setTitle("Create your account");
        frame.setSize(500, 300);
        frame.setLocation(200, 200);

        frame.setMinimumSize(new Dimension(500, 300));
    }

    private void initComponents() {

        panel = new JPanel();

        firstNameText = new JLabel("First Name");
        lastNameText = new JLabel("Last Name");
        emailText = new JLabel("Email");
        passwordText = new JLabel("Password");

        firstNameField = new JTextField(20);
        lastNameField = new JTextField(20);
        emailField = new JTextField(20);
        passwordField = new JPasswordField(20);

        createButton = new JButton("Create account");
        clearButton = new JButton("Clear fields");
    }

    private void placeComponents(JPanel panel) {

        panel.setLayout(null);

        firstNameText.setBounds(10, 20, 80, 25); panel.add(firstNameText);
        lastNameText.setBounds(10, 50, 80, 25); panel.add(lastNameText);
        emailText.setBounds(10, 80, 80, 25); panel.add(emailText);
        passwordText.setBounds(10, 110, 80, 25); panel.add(passwordText);

        firstNameField.setBounds(100, 20, 165, 25); panel.add(firstNameField);
        lastNameField.setBounds(100, 50, 165, 25); panel.add(lastNameField);
        emailField.setBounds(100, 80, 165, 25); panel.add(emailField);
        passwordField.setBounds(100, 110, 165, 25); panel.add(passwordField);

        createButton.setBounds(10, 160, 120, 25); panel.add(createButton);
        clearButton.setBounds(155, 160, 110, 25); panel.add(clearButton);
    }
}
