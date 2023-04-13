package Bank_Management_System;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupTwo extends JFrame implements ActionListener {

    long random;
    JTextField nameTextField, fnameTextField, emailTextField ,addressTextField ,cityTextField, stateTextField ,pincodeTextField;
    JButton next;
    JRadioButton male, female , married , unmarried, other;
    JDateChooser dateChooser;


    SignupTwo(){
        setLayout(null);
        setTitle("New account application forkm - Page 2");
       //APPLICATION FORM NUMBER

        JLabel addtionaldetails = new JLabel("Page 2: Additional Details");
        addtionaldetails.setFont(new Font("Raleway",Font.BOLD,22));
        addtionaldetails.setBounds(290,80,400,30);
        add(addtionaldetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        nameTextField.setBounds( 300,140,400,30);
        add(nameTextField);

        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        fnameTextField.setBounds( 300,190,400,30);
        add(fnameTextField);

        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240, 400,30);
        dateChooser.setForeground(new Color(250,250,250));
        add(dateChooser);

        JLabel gender = new JLabel("Educational:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290 ,60, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("female");
        female.setBounds(450,290,100,30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        emailTextField.setBounds( 300,340,400,30);
        add(emailTextField);

        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(300, 390 ,100, 30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other = new JRadioButton("Others");
        other.setBounds(600,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);

        JLabel address = new JLabel("Pan Number:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        addressTextField.setBounds( 300,440,400,30);
        add(addressTextField);


        JLabel city = new JLabel("Adhar Number:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        cityTextField.setBounds( 300,490,400,30);
        add(cityTextField);

        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        stateTextField.setBounds( 300,540,400,30);
        add(stateTextField);

        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        pincodeTextField.setBounds( 300,590,400,30);
        add(pincodeTextField);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String formno = ""+ random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()){
            gender = "male";
        } else if (female.isSelected()) {
            gender = "female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected()){
            marital = "married";
        }
        if (unmarried.isSelected()){
            marital="unmarried";
        }
        if (other.isSelected()){
            marital = "other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();

        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is required!");
            } else if (fname.equals("")) {
                JOptionPane.showMessageDialog(null,"Father's name is required!");
            }else if (dob.equals("")) {
                JOptionPane.showMessageDialog(null,"Date of birth is required!");
            }else if (gender.equals("")) {
                JOptionPane.showMessageDialog(null,"Gender is required!");
            }else if (email.equals("")) {
                JOptionPane.showMessageDialog(null,"Email is required!");
            }else if (marital.equals("")) {
                JOptionPane.showMessageDialog(null,"Marital Status is required!");
            }else if (address.equals("")) {
                JOptionPane.showMessageDialog(null,"Address is required!");
            }else if (city.equals("")) {
                JOptionPane.showMessageDialog(null,"City is required!");
            }else if (state.equals("")) {
                JOptionPane.showMessageDialog(null,"State is required!");
            }else if (pincode.equals("")) {
                JOptionPane.showMessageDialog(null,"Pin Code is required!");
            }else {
                conn c = new conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c.s.executeUpdate(query);
            }
        } catch (Exception e){
            System.out.println(e);
        }

    }
    public static void main(String args[]){

        new SignupTwo();
    }
}
