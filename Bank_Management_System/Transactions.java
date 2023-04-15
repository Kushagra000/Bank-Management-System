package Bank_Management_System;

import javax.swing.*;
import java.awt.*;

public class Transactions extends JFrame {
    Transactions(){

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Bank_Management_System/icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        add(image);
        setSize(900,900);
        setLocation(300,0);
        setVisible(true );
    }

    public static void main(String args[]){
        new Transactions();
    }
}
