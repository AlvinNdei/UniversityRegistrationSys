package storage;

import java.util.HashMap;
import java.util.Map;

public class StudentsRepo {
    private final Map<String,String> students=new HashMap<>();
    public void displayStudents(){
        this.students.put("001","Ashley");
        this.students.put("002","Angel");
        this.students.put("003","Sasha");
        this.students.put("004","Martin");
        System.out.println(students);
    }
}
