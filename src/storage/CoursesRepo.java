package storage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CoursesRepo {
    //a map to hold courses with their code.
    Map<String,String> courses=new HashMap<>();

    //a method to add new courses.
    public void addCourse(String code,String name){
        this.courses.put(code,name);

        //let's add a few default courses

    }
    //a method to display the courses available.
    public void PrintCourses(){
        System.out.println(courses);
    }
}
