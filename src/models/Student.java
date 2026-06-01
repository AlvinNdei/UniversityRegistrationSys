package models;

import storage.CoursesRepo;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Student implements ActionListener {
    JFrame frame=new JFrame();
    JLabel label1=new JLabel("Welcome to your dashboard!!");
    JButton button1=new JButton("Display Courses");
    JButton button2=new JButton("Reg. for a Course");
    JButton button3=new JButton("View Classes");
    JButton button4=new JButton("LogOut");



    public Student(){
        label1.setBounds(0,0,100,50);
        label1.setFont(new Font(null,Font.PLAIN,25));
        label1.setVerticalAlignment(JLabel.TOP);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920,1080);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());

        JPanel panel1=new JPanel();
        panel1.setBackground(new Color(1,0,72));
        panel1.setPreferredSize(new Dimension(150,100));

        //buttons for the panel
        button1.setBounds(0,180,100,50);
        button1.setFocusable(false);
        button1.addActionListener(this);

        button2.setBounds(0,180,100,50);
        button2.setFocusable(false);
        button2.addActionListener(this);

        button3.setBounds(0,230,100,50);
        button3.setFocusable(false);
        button3.addActionListener(this);

        button4.setBounds(0,280,100,50);
        button4.setFocusable(false);
        button4.addActionListener(this);

        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);


        frame.add(panel1,BorderLayout.WEST);
        frame.add(label1);

    }

//    public void displayCourses(){
//        System.out.println("Here are the available courses");
//
//        CoursesRepo displayCourses=new CoursesRepo();
//        displayCourses.PrintCourses();
//    }
    public void addStudent(){
        System.out.println("Do you want to add a student? y/n");
        Scanner scanner=new Scanner(System.in);
        String choice=scanner.next();
        if(choice.equals("y")){
            Scanner fields=new Scanner(System.in);
            System.out.println("Input the name: ");
            String name=fields.next();
            //validation for student name if it is filled.
            if (name==null||name.isBlank()){
                System.out.println("Please input a value in the name field!!");
            }
            System.out.println("input the registration number: ");
            String reg_no=fields.next();
            //validation for student registration number if it is filled.
            if (reg_no==null||reg_no.isBlank()){
                System.out.println("Please input a value in the Registration field!!");
            }
            System.out.println("Student added Successfully!!");
        }else if (choice.equals("n")){
            System.out.println("Okay you may proceed");
        }else{
            System.out.println("Invalid choice");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1){
            frame.dispose();
            Course courses=new Course();
        }
    }
}
