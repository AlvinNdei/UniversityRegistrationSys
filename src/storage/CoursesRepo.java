package storage;
import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CoursesRepo {
    //a map to hold courses with their code.
    public final static Map<String,String> courses=new HashMap<>();

    static{
        courses.put("Math","ICS1");
        courses.put("English","ICS2");
        courses.put("Physics","ICS3");
        courses.put("Biology","ICS4");
        courses.put("NumberTheory","ICS5");
    }

    //register for a course
    JFrame frame=new JFrame();
    JLabel label=new JLabel();
    JLabel label1=new JLabel();
//    JOptionPane pane1=new JOptionPane();
    public  CoursesRepo(){
        frame.setSize(1920,1080);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        label.setText("Hello welcome to the course registration!!");
        label1.setText("The available courses are as follows");


        String name=JOptionPane.showInputDialog(null,"Enter Course name: ");
        if(name==null){
            return;
        }else if(courses.containsKey(name)){
            JOptionPane.showMessageDialog(null,"Course Found\nCourse code " + courses.get(name));
        }else{
            JOptionPane.showMessageDialog(null,"Course not Found! Available courses are: " + courses);
        }
        frame.add(label);
        frame.add(label1);
    }
}
