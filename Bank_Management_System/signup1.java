package Bank_Management_System;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
public class signup1 extends JFrame {

    signup1(){
        setLayout(null);
        Random ran  = new Random();
        long random = Math.abs((ran.nextLong()%9000L)+1000L);

        //APPLICATION FORM NUMBER
        JLabel formno = new JLabel("Application  Form No: "+ random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);


        JLabel persondetails = new JLabel("Page 1: Personal Details");
        persondetails.setFont(new Font("Raleway",Font.BOLD,22));
        persondetails.setBounds(290,80,400,30);
        add(persondetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        nameTextField.setBounds( 300,140,400,30);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        JTextField fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        fnameTextField.setBounds( 300,190,400,30);
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240, 200,30);
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);

        JTextField emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        emailTextField.setBounds( 300,340,400,30);
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        JTextField addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        addressTextField.setBounds( 300,440,400,30);
        add(addressTextField);


        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        JTextField cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        cityTextField.setBounds( 300,490,400,30);
        add(cityTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        JTextField stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        stateTextField.setBounds( 300,540,400,30);
        add(stateTextField);

        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        JTextField pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        pincodeTextField.setBounds( 300,590,400,30);
        add(pincodeTextField);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public static void main(String args[]){
        new signup1();
    }
}
