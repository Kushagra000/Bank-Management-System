package Bank_Management_System;

import javax.swing.*;
import java.awt.*;

public class SignupThree extends JFrame{
    SignupThree(){

        setLayout(null);
        JLabel l1 =new JLabel("Page 3:Account details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }
    public static void main (String args[]){
        new SignupThree();
    }
}
