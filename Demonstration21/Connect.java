import java.sql.*;
public class Connect {
    public static void main (String[] args) {
        Connection conn = null;
        try{
            String userName = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/test";
            Class.forName ("com.mysql.cj.jdbc.Driver"); // This is the newest driver
            conn = DriverManager.getConnection (url, userName, password);
            System.out.println ("Database connection established");
        }
        catch (Exception e) {
            System.err.println ("Cannot connect to database server:"+e);
        } finally {
            if (conn != null) {
                try {
                    conn.close ();
                    System.out.println ("Database connection terminated:");
                } catch (Exception e) { /* ignore close errors */ }
            }     
        } 
    } 
}
