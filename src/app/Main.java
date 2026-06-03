package app;

import models.Student;
import storage.StudentsRepo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    JFrame frame;
    JButton loginButton;
    JButton resetButton;
    JTextField userNameField;
    JPasswordField userPasswordField;
    ImageIcon icon;
    JPanel panel1;
    public Main(){
        frame=new JFrame();
        frame.setLayout(new BorderLayout());
        panel1=new JPanel();
        loginButton=new JButton("LogIn");
        resetButton=new JButton("Reset");
        userNameField = new JTextField(15);
        userPasswordField = new JPasswordField(15);
        icon=new ImageIcon("src/school.png");

        panel1.setLayout(new GridBagLayout());



        JLabel userNameLabel = new JLabel("userName:");
        JLabel userPasswordLabel = new JLabel("Password:");
        JLabel welcomeLabel= new JLabel("WELCOME TO THE UNIVERSITY REGISTRATION SYSTEM");

        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);

        welcomeLabel.setForeground(Color.BLACK);

        userNameLabel.setBounds(50,100,75,25);
        userNameLabel.setForeground(Color.BLACK);
        userPasswordLabel.setBounds(50,150,75,25);
        userPasswordLabel.setForeground(Color.BLACK);


        userNameField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);


        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);



        frame.setTitle("UniversityRegistrationSystem");
        frame.setIconImage(icon.getImage());
        frame.add(welcomeLabel, BorderLayout.NORTH);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 10, 8, 10);

        gbc.gridx = 0; gbc.gridy = 0; panel1.add(userNameLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 0; panel1.add(userPasswordLabel, gbc);
        gbc.gridx = 0; gbc.gridy = 1; panel1.add(userNameField, gbc);
        gbc.gridx = 1; gbc.gridy = 1; panel1.add(userPasswordField, gbc);
        gbc.gridx = 0; gbc.gridy = 2; panel1.add(loginButton, gbc);
        gbc.gridx = 1; gbc.gridy = 2; panel1.add(resetButton, gbc);
        frame.add(panel1,BorderLayout.CENTER);

        frame.getContentPane().setBackground(new Color(177,183,193));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[]args){
        new Main();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==resetButton) {
            userNameField.setText("");
            userPasswordField.setText("");
        }
        if (e.getSource()==loginButton){
            String username=userNameField.getText();
            String password=new String(userPasswordField.getPassword());

            if (StudentsRepo.verifyLogin(username,password)){
                frame.dispose();
                new Student();
                JOptionPane.showMessageDialog(null,"Welcome back "+username +"!");
            }else {
                JOptionPane.showMessageDialog(null,"Invalid username or password.","Login Failed",JOptionPane.ERROR_MESSAGE);
            }
        }

    }
}