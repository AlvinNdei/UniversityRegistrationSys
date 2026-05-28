package storage;

import java.util.HashMap;
import java.util.Map;

public class StudentsRepo {
    public static void main(String[]args){
        Map<String,String> students=new HashMap<>();
        students.put("alvin","reg_no3452");
        students.put("amos","reg_no3452");
        students.put("anton","reg_no3452");
        students.put("sasha","reg_no3452");
        for(Map.Entry<String ,String> entry:students.entrySet()){
            String name =entry.getKey();
            String reg_no=entry.getValue();
            System.out.println("Name: "+name);
            System.out.println("Registration number: " +reg_no);
        }
    }

}
