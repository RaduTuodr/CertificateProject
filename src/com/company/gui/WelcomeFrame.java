package com.company.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.company.util.OverlapImages.overlapImages;

public class WelcomeFrame  extends JFrame {

    JFrame frame;
    Container container;

    ImageIcon welcomeImage,
            messageImage;
    JLabel welcomeLabel,
            messageLabel;

    JButton signUp,
            signIn;


    public WelcomeFrame() {

        frame = new JFrame();
        setUpFrame();

        initComponents();
        addImageToLabel();
        placeComponents();

        frame.setVisible(true);

        signUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();
                new SignUpFrame();
            }
        });

        signIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();
                new SignInFrame();
            }
        });
    }

    private void initComponents() {

        welcomeLabel = new JLabel();
        messageLabel = new JLabel();
        container = new Container();

        signIn = new JButton("LOG IN");
        signUp = new JButton("SIGN IN");

        welcomeImage = new ImageIcon("src/Bliss_(Windows_XP).png");
        messageImage = new ImageIcon("src/welcomeText.png");
    }

    private void setUpFrame() {

        frame.setTitle("Welcome!");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addImageToLabel() {

        container = frame.getContentPane();

        welcomeLabel.setIcon(welcomeImage);
        welcomeLabel.setBounds(0, 0, welcomeImage.getIconWidth(), welcomeImage.getIconHeight());

        welcomeLabel.setIcon(overlapImages("src/Bliss_(Windows_XP).png", "src/welcomeText.png",
                welcomeImage.getIconWidth() / 2 - messageImage.getIconWidth() / 2 - 10, 50));

        container.add(welcomeLabel);

        frame.setBounds(0, 0, welcomeImage.getIconWidth(), welcomeImage.getIconHeight() - 2);
    }

    private void placeComponents() {

        signUp.setBounds(10, 140, 120, 40); container.add(signUp);
        signIn.setBounds(10 + 120 + 20, 140, 120, 40); container.add(signIn);
    }
}
