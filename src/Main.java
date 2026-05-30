import models.Admin;
import models.Student;
import storage.StudentsRepo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main implements ActionListener {
    JFrame frame;
    JButton loginButton;
    JTextField userNameField;
    JPasswordField userPasswordField;
    public Main(){
        frame=new JFrame();
        loginButton=new JButton("LogIn");
        userNameField = new JTextField();
        userPasswordField = new JPasswordField();

        JLabel userNameLabel = new JLabel("userID:");
        JLabel userPasswordLabel = new JLabel("Password:");
        JLabel welcomeLabel= new JLabel("WELCOME TO THE UNIVERSITY REGISTRATION SYSTEM");

        welcomeLabel.setBounds(50,50,800,25);

        userNameLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);


        userNameField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);


        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);


        frame.setTitle("UniversityRegSys");
        frame.add(welcomeLabel);
        frame.add(userNameLabel);
        frame.add(userPasswordLabel);
        frame.add(userNameField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920,1080);
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
        String username=userNameField.getText();
        String password=new String(userPasswordField.getPassword());

        if (StudentsRepo.verifyLogin(username,password)){
            JOptionPane.showMessageDialog(null,"Login successful! Welcome" + username +"!");
        }else {
            JOptionPane.showMessageDialog(null,"Invalid username or password.","Login Failed",JOptionPane.ERROR_MESSAGE);
        }
    }
}