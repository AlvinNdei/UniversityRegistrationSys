package models;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lecturer {
    private final Map<String,String> staff=new HashMap<>();

    public void addLecturer(){
        System.out.println("Enter Lecturer's name:");
        Scanner fields=new Scanner(System.in);
        String name=fields.next();
        System.out.println("Enter Lecturer's ID:");
        String ID=fields.next();
        System.out.println("Lecturer created successfully!!");
    }
    public void printStaff(){
        this.staff.put("Dr. Anton","001");
        this.staff.put("Dr. Samuel","002");
        System.out.println(staff);
    }
}
