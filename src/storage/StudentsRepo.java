package storage;

import java.util.HashMap;
import java.util.Map;

public class StudentsRepo {
    //a map for storing student information.
    Map<String,String> students= new HashMap<>();

    //a method to add a new student which we call in the main method in the main class.
    public void addStudents(String name,String reg_no){this.students.put(name,reg_no);
    }

    //a method to display the students in the university.
    public void displayStudents(){
        System.out.println(students);
    }
}
