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
    public  CoursesRepo(){
        frame.setSize(600,400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(177,183,193));


        label.setText("Hello welcome to the course registration!!");
        label1.setText("The available courses are as follows");


        String name=JOptionPane.showInputDialog(null,"Enter Course name: ");
        if(name==null){
            return;
        }else if(courses.containsKey(name)){
            String course=courses.get(name);
            JOptionPane.showMessageDialog(null,"Course Found\nCourse code " + course);
            String stdname=JOptionPane.showInputDialog(null,"Enter Your name");
            JOptionPane.showMessageDialog(null,"You have been registered for: "
                    + course +" Thank you " +stdname+"! for registering with us.");
            JOptionPane.showMessageDialog(null,"Press OK to exit the page");
            frame.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Course not Found! Available courses are: " + courses);
            JOptionPane.showMessageDialog(null,"Press OK to exit the page");
            frame.dispose();
        }
        frame.add(label);
        frame.add(label1);
    }
}
