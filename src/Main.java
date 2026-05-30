import models.Admin;
import models.Student;

//import javax.swing.*;
//import java.awt.*;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
//        JFrame frame=new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(new Dimension(420,420));
//        frame.setTitle("UNR system");
//
//        frame.setLayout(new BorderLayout());
//        frame.add(new JButton("Login"));
//        frame.setVisible(true);
// Welcome message
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