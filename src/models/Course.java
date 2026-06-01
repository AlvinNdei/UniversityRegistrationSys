package models;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

public class Course {

    private static HashMap<String,String>courses= new HashMap<>();
   static {
       courses.put("ICS200", "Electronics-ICS200");
       courses.put("ICS201", "Databases-ICS201");
       courses.put("ICS202", "Operating sys-ICS202");
       courses.put("ICS203", "Physics-ICS203");
       courses.put("ICS204", "Algebra-ICS204");
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
        list.setBackground(new Color(212,228,253));

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
