package models;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

public class Course {

    private static HashMap<String,String>courses= new HashMap<>();
   static {
       courses.put("ICS200", "Electronics");
       courses.put("ICS201", "Databases");
       courses.put("ICS202", "Operating sys");
       courses.put("ICS203", "Physics");
       courses.put("ICS203", "Algebra");
   }
    JFrame frame;
    JLabel label;
    public Course(){
        frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920,1080);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(9,0,136));

        String[] values=courses.values().toArray(new String[0]);
        JList<String>list=new JList<>(values);
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setBounds(50, 60, 150, 150);

        label=new JLabel("Welcome to the courses page!!");
        label.setBounds(0,0,1920,50);
        label.setForeground(Color.BLACK);
        label.setFont(new Font(null,Font.PLAIN,25));
        label.setVerticalAlignment(JLabel.TOP);


        frame.add(label);
        frame.add(scrollPane);
        frame.setVisible(true);



    }
}
