import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertJavaDatabase {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String NameString, RollString, MarksString, GradeString;
        try {
            String userName = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/test";
			Class.forName("com.mysql.cj.jdbc.Driver"); // updated driver class
			conn = DriverManager.getConnection(url, userName, password);
            stmt = conn.createStatement();
            stmt.executeQuery("Select * from javacourse");
            rs= stmt.getResultSet();
            System.out.println("\n\n-------------Result before insert--------------\n");
            while (rs.next()) {
                NameString = rs.getString("Name");
                RollString = rs.getString("Roll");
                MarksString = rs.getString("Marks");
                GradeString = rs.getString("Grade");
                System.out.println("Name: " + NameString + "\t\t" + "Roll: " + RollString + "\t\t" + MarksString + "\t\t" + GradeString + "\n");
            }
            stmt.execute("INSERT INTO JAVACOURSE VALUES(01, 'Debasis Kundu', 75, 'A')");
            stmt.execute("INSERT INTO JAVACOURSE VALUES(02, 'Suhel Khan', 75, 'EX')");
            stmt.execute("INSERT INTO JAVACOURSE VALUES(03, 'Waris BRo', 95, 'B')");
            stmt.execute("INSERT INTO JAVACOURSE VALUES(04, 'Azam bhaiwa', 85, 'A')");
            stmt.execute("INSERT INTO JAVACOURSE VALUES(06, 'Saif', 45, 'D')");
            stmt.execute("INSERT INTO JAVACOURSE VALUES(05, 'Sadique', 65, 'C')");
            stmt.execute("INSERT INTO JAVACOURSE VALUES(07, 'Gomu Das', 55, 'C')");
            
            stmt.executeQuery("Select * from javacourse");
            rs = stmt.getResultSet();

            System.out.println("\n\n-------------Result After insert--------------\n");
            while (rs.next()) {
                NameString = rs.getString("Name");
                RollString = rs.getString("Roll");
                MarksString = rs.getString("Marks");
                GradeString = rs.getString("Grade");
                System.out.println("Name: " + NameString + "\t\t" + "Roll: " + RollString + "\t\t" + MarksString + "\t\t" + GradeString + "\n");
            }
        } catch (SQLException ex) {
            // TODO: handle exception
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("Vendor Error: " + ex.getErrorCode());
        }
        catch(Exception e){
            System.err.println("Can't connect to SQl server !");
        }
    }
}
