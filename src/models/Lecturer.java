package models;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lecturer {
    private static final Map<String,String> staff=new HashMap<>();
    static{
        staff.put("Dr. Anton","001");
        staff.put("Dr. Samuel","002");
    }
    public void addLecturer(){
        System.out.println("Enter Lecturer's name:");
        Scanner fields=new Scanner(System.in);
        String name=fields.next();
        System.out.println("Enter Lecturer's ID:");
        String ID=fields.next();
        staff.put(name,ID);
        System.out.println(staff);
        System.out.println("Lecturer created successfully!!");
    }
    public void printStaff(){
        System.out.println(staff);
    }
}
