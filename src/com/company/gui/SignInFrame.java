package com.company.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignInFrame {

    JFrame frame;
    JPanel panel;

    JLabel emailText,
            passwordText;

    JTextField emailField;
    JPasswordField passwordField;

    JButton nextBtn;

    public SignInFrame() {

        initComponents();
        setUpArgs();
        placeComponents();

        frame.setVisible(true);

        nextBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();

                // TODO: check for valid credentials
            }
        });
    }

    private void setUpArgs() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Sign In");
        frame.setSize(300, 240);
        frame.setLocation(200, 200);
        frame.setMinimumSize(new Dimension(300, 240));
        frame.setResizable(false);


        panel.setLayout(null);
        frame.add(panel);
    }

    private void initComponents() {

        frame = new JFrame();
        panel = new JPanel();

        emailText = new JLabel("Email");
        passwordText = new JLabel("Password");

        emailField = new JTextField(20);
        passwordField = new JPasswordField(20);

        nextBtn = new JButton("Next");
    }

    private void placeComponents() {

        emailText.setBounds(10, 20, 60, 25); panel.add(emailText);
        passwordText.setBounds(10, 50, 60, 25); panel.add(passwordText);

        emailField.setBounds(10 + 80 + 5, 20, 150, 25); panel.add(emailField);
        passwordField.setBounds(10 + 80 + 5, 50, 150, 25); panel.add(passwordField);

        nextBtn.setBounds(150, 100, 95, 25); panel.add(nextBtn);
    }
}
