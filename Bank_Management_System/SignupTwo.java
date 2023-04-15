package Bank_Management_System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField   panTextField ,aadharTextField;
    JButton next;
    JRadioButton  syes , sno, eyes,eno;

    JComboBox religion,category,occupation,education,income;
    String formno;


    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        setTitle("New account application form - Page 2");
       //APPLICATION FORM NUMBER

        JLabel addtionaldetails = new JLabel("Page 2: Additional Details");
        addtionaldetails.setFont(new Font("Raleway",Font.BOLD,22));
        addtionaldetails.setBounds(290,80,400,30);
        add(addtionaldetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religion= new  JComboBox(valReligion);
        religion.setBounds( 300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);


        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        String valCategory[]={"General","OBC","SC","ST","Other"};
        category = new JComboBox(valCategory);
        category.setBounds( 300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        String valincome[]={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
        income = new JComboBox(valincome);
        income.setBackground(Color.WHITE);
        income.setBounds(300,240,400,30);
        add(income);

        JLabel gender = new JLabel("Educational");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);

        String educationalvalues[]={"Non-Graduation","Graduate","Post Graduate","Doctorate","Other"};
        education = new JComboBox(educationalvalues);
        education.setBounds( 300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        String occupationval[]={"Salaried","Self-Employed","Business","Student","Retired","Other"};
        occupation = new JComboBox(occupationval);
        occupation.setBounds( 300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel pan = new JLabel("Pan Number:");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100,440,200,30);
        add(pan);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        panTextField.setBounds( 300,440,400,30);
        add(panTextField);


        JLabel city = new JLabel("Aadhar Number:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD ,14));
        aadharTextField.setBounds( 300,490,400,30);
        add(aadharTextField);

        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540 ,100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);

        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590 ,100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup Existinggroup = new ButtonGroup();
        Existinggroup.add(eyes);
        Existinggroup.add(eno);

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
        String sreligion =(String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation =(String) education.getSelectedItem();
        String soccupation =(String) occupation.getSelectedItem();

        String senioncitizen = null;
        if (syes.isSelected()){
            senioncitizen = "Yes";
        } else if (sno.isSelected()) {
            senioncitizen = "No";
        }
        String existingaccount = null;
        if (eyes.isSelected()){
            existingaccount = "Yes";
        }
        if (eno.isSelected()){
            existingaccount="No";
        }
        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();

        try{
            if(saadhar.equals("")){
                JOptionPane.showMessageDialog(null,"Aadhar is required!");
            } else if (scategory.equals("")) {
                JOptionPane.showMessageDialog(null,"Select Category!");
            }else if (span.equals("")) {
                JOptionPane.showMessageDialog(null,"Pan is required!");
            }else if (seducation.equals("")) {
                JOptionPane.showMessageDialog(null,"Select education!");
            }else if (sincome.equals("")) {
                JOptionPane.showMessageDialog(null,"Select income!");
            }else if (soccupation.equals("")) {
                JOptionPane.showMessageDialog(null,"Select Occupation!");
            }else if (sreligion.equals("")) {
                JOptionPane.showMessageDialog(null,"Select Religion!");
            }else if (senioncitizen.equals("")) {
                JOptionPane.showMessageDialog(null,"Fill senior citizen query!");
            }else if (existingaccount.equals("")) {
                JOptionPane.showMessageDialog(null,"Fill Existing account Query!");
            }else {
                conn c = new conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+senioncitizen+"','"+existingaccount+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }
        } catch (Exception e){
            System.out.println(e);
        }

    }
    public static void main(String args[]){

        new SignupTwo("");
    }
}
