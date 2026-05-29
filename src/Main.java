import models.Admin;
import models.Student;
import storage.CoursesRepo;
import storage.StudentsRepo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
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
            String PASSWORD="alvin0325";
            if(password.equals(PASSWORD)){
                Admin showPanel=new Admin();
                showPanel.adminPanel();
            }else{
                System.out.println("WRONG PASSWORD!!");
            }

        }else{
            System.out.println("Invalid choice");
        }


        //method for adding courses and displaying courses.
//        CoursesRepo new_course=new CoursesRepo();
//        new_course.addCourse("CS209","Number Theory");
//        new_course.addCourse("CS200","Computer Graphics");
//        new_course.PrintCourses();
    }
}