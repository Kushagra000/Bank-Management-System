package Bank_Management_System;
import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    public conn(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Kushagra0702");
            s = c.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
