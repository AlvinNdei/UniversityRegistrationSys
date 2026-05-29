package models;

import java.util.Scanner;

public class Admin {
    public void adminPanel(){
        Scanner input=new Scanner(System.in);

        System.out.println("Choose your operation");
        System.out.println("1.Add a student");
        System.out.println("2.Add a course");
        System.out.println("3.Edit a course");
        System.out.println("4.Delete a Student");
        System.out.println("5.Assign Course to a Lecturer");
        System.out.println("6.Enroll a student");
        System.out.println("7.Logout");
        int operation=input.nextInt();
        if (operation==1){
            //calling an already defined method since a method cannot exist inside an if statement.
            addStudent();
        }
    }
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
}
