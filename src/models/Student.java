package models;

import storage.CoursesRepo;

import java.util.Scanner;

public class Student {
    public void displayCourses(){
        System.out.println("Here are the available courses");

        CoursesRepo displayCourses=new CoursesRepo();
        displayCourses.PrintCourses();
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
