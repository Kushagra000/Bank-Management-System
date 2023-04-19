package Bank_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit, cancel;
    String formno;
    SignupThree(String formno){
        this.formno = formno;

        setLayout(null);
        JLabel l1 =new JLabel("Page 3:Account details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel type =new JLabel("Account type:");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        setBackground(Color.WHITE);
        r1.setBounds(100,180,250,20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposite Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        setBackground(Color.WHITE);
        r2.setBounds(350,180,250,20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        setBackground(Color.WHITE);
        r3.setBounds(100,220,250,20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposite Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        JLabel card =new JLabel("Card Number:");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);

        JLabel number =new JLabel("XXXX-XXXX-XXXX-0702");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);

        JLabel carddetails =new JLabel("Your 16 digit card number");
        carddetails.setFont(new Font("Raleway",Font.BOLD,12));
        carddetails.setBounds(100,330,300,20);
        add(carddetails);

        JLabel pin =new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);

        JLabel pnumber =new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);

        JLabel pindetails =new JLabel("Your 4 digit pin number");
        pindetails.setFont(new Font("Raleway",Font.BOLD,12));
        pindetails.setBounds(100,400,300,20);
        add(pindetails);

        JLabel services =new JLabel("Services required  :");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,400,30);
        add(services);

        c1 =new JCheckBox("ATM card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2 =new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3 =new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4 =new JCheckBox("Email & SMS alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5 =new JCheckBox("Check Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6 =new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);

        c7 =new JCheckBox("I here by declares that the above entered details are correct to the best of my knowledge.");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,16));
        c7.setBounds(100,680,600,30);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("RAleway",Font.BOLD,14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("RAleway",Font.BOLD,14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }

    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()==submit){
            String Accounttype = null;
                    if(r1.isSelected()){
                        Accounttype = "Saving Account";
                    } else if (r2.isSelected()) {
                        Accounttype = "Fixed Deposite Account";
                    } else if (r3.isSelected()) {
                        Accounttype = "Current Account";
                    } else if (r4.isSelected()) {
                        Accounttype = "Recurring Account Deposite";
                    }
                    Random random = new Random();
                    String cardnumber  =""+ Math.abs((random.nextLong()%90000000L)+5040936000000000L);
                    String pinnumber =""+ Math.abs((random.nextLong()%9000L)+1000L);
                    String Facility = "";
                    if (c1.isSelected()){
                        Facility = Facility +"ATM card ";
                    } if (c2.isSelected()) {
                        Facility = Facility+"Internet banking ";
                    } if (c3.isSelected()) {
                        Facility = Facility + "Mobile banking ";
                    } if (c4.isSelected()) {
                        Facility = Facility + "Email & SMS Alert ";
                    }if (c6.isSelected()) {
                        Facility = Facility + "Check Book ";
                    }if (c2.isSelected()) {
                        Facility = Facility + "E-Statement ";
                    }
                    try{
                        if(Accounttype.equals("")){
                            JOptionPane.showMessageDialog(null,"Choose your account type.");
                        } else {
                            conn c = new conn();
                            String query1 =  "insert into  signupthree values('"+formno+"','"+Accounttype+"','"+cardnumber+"','"+pinnumber+"','"+Facility+"')";
                            String query2 =  "insert into  login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";

                            c.s.executeUpdate(query1);
                            c.s.executeUpdate(query2);

                            JOptionPane.showMessageDialog(null,"Card Number: "+ cardnumber + "/n"+"Pin Number: " +pinnumber);
                            setVisible(false);
                            new deposit(pinnumber).setVisible(true);
                        }
                    }catch (Exception e){
                        System.out.println(e);
                    }
        } else if (ae.getSource()==cancel) {
            setVisible(false);
            new Login().setVisible(true);
            
        }
    } 
    public static void main (String args[]){
        new SignupThree("");
    }
}
