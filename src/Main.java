import storage.StudentsRepo;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String []args){
        StudentsRepo new_students = new StudentsRepo();
        new_students.addStudents("Abigael","reg_no67994");
        new_students.displayStudents();
    }
}