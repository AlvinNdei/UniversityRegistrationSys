import storage.StudentsRepo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        StudentsRepo new_students = new StudentsRepo();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input your name: ");
        String name=scanner.next();
        System.out.println("Input your registration number: ");
        String reg_no=scanner.next();
        new_students.addStudents(name,reg_no);
        new_students.displayStudents();
    }
}