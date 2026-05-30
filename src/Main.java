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
        JButton button=new JButton("LogIN");
        button.addActionListener(this);

        JLabel label= new JLabel("WELCOME TO THE UNIVERSITY REGISTRATION SYSTEM");


        JPanel panel=new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(label);
        panel.add(button);


        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("UniversityRegSys");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[]args){;
        new Main();
// Welcome message
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

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}