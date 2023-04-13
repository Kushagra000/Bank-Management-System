package Bank_Management_System;
import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","Kushagra0702");
            s = c.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
