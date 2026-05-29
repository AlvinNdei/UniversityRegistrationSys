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
                System.out.println("Redirect to admin panel");
            }else{
                System.out.println("WRONG PASSWORD!!");
            }

        }else{
            System.out.println("Invalid choice");
        }
        //An object for adding new students.
        StudentsRepo new_students = new StudentsRepo();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input your name: ");
        String name=scanner.next();
        System.out.println("Input your registration number: ");
        String reg_no=scanner.next();
        new_students.addStudents(name,reg_no);
        new_students.displayStudents();

        //method for adding courses and displaying courses.
        CoursesRepo new_course=new CoursesRepo();
        new_course.addCourse("CS209","Number Theory");
        new_course.addCourse("CS200","Computer Graphics");
        new_course.PrintCourses();
    }
}