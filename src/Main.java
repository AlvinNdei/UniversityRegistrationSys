import storage.CoursesRepo;
import storage.StudentsRepo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
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
        new_course.addCourse("CS203","Number Theory");
        new_course.PrintCourses();
    }
}