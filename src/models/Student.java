package models;

import storage.CoursesRepo;

public class Student {
    public void displayCourses(){
        System.out.println("Here are the available courses");

        CoursesRepo displayCourses=new CoursesRepo();
        displayCourses.PrintCourses();
    }
}
