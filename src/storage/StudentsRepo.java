package storage;

import java.util.HashMap;
import java.util.Map;

public class StudentsRepo {
    private final static Map<String,String> students=new HashMap<>();

    //where we store our passwords locally
    static{
        students.put("Janice","1234");
        students.put("Ashley","5678");
        students.put("Angel","9123");
        students.put("Sasha","4567");
        students.put("Martin","8901");
    }

    public static boolean verifyLogin(String username,String password){
        return students.containsKey(username)&&
                students.get(username).equals(password);
    }
}
