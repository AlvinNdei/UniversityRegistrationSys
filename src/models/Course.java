package models;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Course {
    JFrame frame;
    JLabel label;
    public Course(){
        frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920,1080);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(124,80,26));

        label=new JLabel("Welcome to the courses page!!");
        label.setBounds(0,0,1920,50);
        label.setFont(new Font(null,Font.PLAIN,25));
        label.setVerticalAlignment(JLabel.TOP);

        frame.add(label);


    }
}
