package Bank_Management_System;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class signup1 extends JFrame {

    signup1(){
        setLayout(null);
        Random ran  = new Random();
        long random = Math.abs((ran.nextLong()%9000L)+1000L);

        //APPLICATION FORM NUMBER
        JLabel formno = new JLabel("Application  Form No"+ random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);


        JLabel persondetails = new JLabel("Page 1: Personal Details");
        persondetails.setFont(new Font("Raleway",Font.BOLD,22));
        persondetails.setBounds(290,80,400,30);
        add(persondetails);
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

    }
    public static void main(String args[]){
        new signup1();
    }
}
