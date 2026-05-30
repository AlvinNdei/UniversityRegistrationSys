import models.Admin;
import models.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main implements ActionListener {
    JFrame frame;
    JPanel panel;
    JButton button;
    public Main(){
        JFrame frame=new JFrame();
        JButton loginButton=new JButton("LogIn");
        JTextField userNameField = new JTextField();
        JTextField userPasswordField = new JTextField();
        JLabel userNameLabel = new JLabel("userID:");
        JLabel userPasswordLabel = new JLabel("Password:");

        userNameLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);


        userNameField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);




        loginButton.addActionListener(this);

        JLabel label= new JLabel("WELCOME TO THE UNIVERSITY REGISTRATION SYSTEM");


        JPanel panel=new JPanel();


        panel.add(label);
        panel.add(loginButton);

        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);


        frame.setTitle("UniversityRegSys");
        frame.add(userNameLabel);
        frame.add(userPasswordLabel);
        frame.add(userNameField);
        frame.add(userPasswordField);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.pack();
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[]args){;
        new Main();
        // Welcome message
        Scanner login= new Scanner(System.in);
        int choice =login.nextInt();
        if (choice==1){
            Student studentPanel=new Student();
            studentPanel.displayCourses();

        }else if(choice==2){
            System.out.println("Enter the password");
            String password=login.next();
            String PASSWORD="1234";
            if(password.equals(PASSWORD)){
                Admin showPanel=new Admin();
                showPanel.adminPanel();
            }else{
                System.out.println("WRONG PASSWORD!!");
            }

        }else{
            System.out.println("Invalid choice");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}