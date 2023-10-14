import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;
   public Conn(){
       try {
           c = DriverManager.getConnection("jdbc:mysql://Localhost/remindermanagementsystem","root","Dablu@123");
           s=c.createStatement();

       }catch (Exception e){
           System.out.println(e);
       }
       }
}
