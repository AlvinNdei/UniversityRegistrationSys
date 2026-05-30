package storage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentsRepo {
    HashMap<String,String> studentsInfo=new HashMap<String,String>();

    //where we store our passwords locally
    StudentsRepo(){
        studentsInfo.put("Janice","1234");
        studentsInfo.put("Ashley","5678");
        studentsInfo.put("Angel","9123");
        studentsInfo.put("Sasha","4567");
        studentsInfo.put("Martin","8901");
    }
    public HashMap getLoginInfo(){
        return logininfo;
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
