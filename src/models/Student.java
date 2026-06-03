package models;



import app.Main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student implements ActionListener {
    JFrame frame=new JFrame();
    JLabel label1=new JLabel("Welcome to your dashboard!!");
    JButton button1=new JButton("Display Courses");
    JButton button2=new JButton("Reg. for a Course");
    JButton button3=new JButton("Calculate GPA");
    JButton button4=new JButton("LogOut");



    public Student(){
        label1.setBounds(0,0,100,50);
        label1.setFont(new Font(null,Font.PLAIN,25));
        label1.setVerticalAlignment(JLabel.TOP);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920,1080);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());

        JPanel panel1=new JPanel();
        panel1.setBackground(new Color(1,0,72));
        panel1.setPreferredSize(new Dimension(150,100));

        JPanel panel2=new JPanel();
        panel2.setBackground(new Color(27,185,238));
        panel2.setPreferredSize(new Dimension(100,100));

        //buttons for the panel
        button1.setBounds(0,180,100,50);
        button1.setFocusable(false);
        button1.addActionListener(this);

        button2.setBounds(0,180,100,50);
        button2.setFocusable(false);
        button2.addActionListener(this);

        button3.setBounds(0,230,100,50);
        button3.setFocusable(false);
        button3.addActionListener(this);

        button4.setBounds(0,280,100,50);
        button4.setFocusable(false);
        button4.addActionListener(this);

        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);


        frame.add(panel1,BorderLayout.WEST);
        frame.add(label1);
        frame.add(panel2,BorderLayout.CENTER);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1){
            frame.dispose();
            Course courses=new Course();
        }

        if (e.getSource() == button4) {
            frame.dispose();

            new Main();
        }
    }
}
