import models.Admin;
import models.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Scanner;

public class Main implements ActionListener {
    public static void main(String []args){
        JFrame frame= new JFrame();
        JButton loginButton =new JButton("Login");
        JButton resetButton =new JButton("Reset");
        JTextField userNameField=new JTextField();
        JPasswordField userPasswordField=new JPasswordField();
        JLabel userNameLabel = new JLabel("userName");
        JLabel userPasswordLabel = new JLabel("password");
        JLabel messageLabel=new JLabel();

        HashMap<String,String> logininfo=new HashMap<String,String>();

        Main(HashMap<String,String>loginInfoOriginal){
            logininfo=loginInfoOriginal;

            userNameLabel.setBounds(50,100,75,25);
            userPasswordLabel.setBounds(50,150,75,25);

            messageLabel.setBounds(125,250,250,35);
            messageLabel.setFont(new Font(null, Font.ITALIC,25));

            userNameField.setBounds(125,100,200,25);
            userPasswordField.setBounds(125,150,200,25);

            loginButton.setBounds(225,200,100,25);
            loginButton.setFocusable(false);
            loginButton.addActionListener(this);

            resetButton.setBounds(225,200,100,25);
            resetButton.setFocusable(false);
            resetButton.addActionListener(this);

            frame.add(userNameLabel);
            frame.add(userPasswordLabel);
            frame.add(messageLabel);
            frame.add(userNameField);
            frame.add(userPasswordField);
        }
        //Welcome message
        System.out.println("WELCOME TO THE UNIVERSITY REGISTRATION SYSTEM");
        System.out.println("Choose your role");
        System.out.println("1.Student");
        System.out.println("2.Admin");
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
}