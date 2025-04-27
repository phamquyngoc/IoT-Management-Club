package project;
import java.sql.*;

/**
 *
 * @author LuongTran
 */
public class ConnectionProvider {
    public static  Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gms", "root", "123456");
            return con;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
