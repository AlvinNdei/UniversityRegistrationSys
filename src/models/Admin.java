package models;

import storage.CoursesRepo;

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
            Student new_student=new Student();
            new_student.addStudent();
        }else if (operation==2){
            Course new_course=new Course();
            new_course.addCourse();
        }
    }
}
