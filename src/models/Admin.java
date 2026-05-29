package models;

import java.util.Scanner;

public class Admin {
    public void addStudent(){
        System.out.println("Do you want to add a student? y/n");
        Scanner scanner=new Scanner(System.in);
        String choice=scanner.next();
        if(choice.equals("y")){
            Scanner fields=new Scanner(System.in);
            System.out.println("Input the name: ");
            String name=fields.next();
            System.out.println("input the registration number: ");
            String reg_no=fields.next();
            System.out.println("Student added Successfully!!");
        }else if (choice.equals("n")){
            System.out.println("Okay you may proceed");
        }else{
            System.out.println("Invalid choice");
        }
    }
}
