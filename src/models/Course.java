package models;

import java.util.Scanner;

public class Course {
    public void addCourse(){
        Scanner fields=new Scanner(System.in);
        System.out.println("Enter the course code: ");
        String code=fields.next();
        System.out.println("Enter the course name: ");
        String name=fields.next();
        System.out.println("Course added successfully!!");
    }
}
