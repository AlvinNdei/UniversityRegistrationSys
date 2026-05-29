package storage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentsRepo {
    public static final Map<String,String> students=new HashMap<>();

    static{
        students.put("001","Janice");
        students.put("002","Ashley");
        students.put("003","Angel");
        students.put("004","Sasha");
        students.put("005","Martin");
    }
    public void displayStudents(){

        System.out.println(students);
    }
    public void deleteStudent(){
        System.out.println("Enter the ID of the student you wanna delete");
        Scanner input=new Scanner(System.in);
        System.out.println(students);
        String ID=input.next();
        students.remove(ID);
        System.out.println("The student has been deleted!!");
    }
}
