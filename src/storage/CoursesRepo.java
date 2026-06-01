package storage;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CoursesRepo {
    //a map to hold courses with their code.
    private final Map<String,String> courses=new HashMap<>();

    //a method to display the courses available.
    public void PrintCourses(){
        //default courses.
        this.courses.put("CS201","Math");
        this.courses.put("CS202","English");
        this.courses.put("CS204","Science");
        this.courses.put("CS205","Physics");
        System.out.println(courses);
    }
}
