import java.sql.*;
public class ProcessingDatabase {
    public static void main (String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        int TotalMarks = 0, Num_Student = 0;
        float avg_Marks;
        String NameString, RollString, MarksString, GradeString;
        try{
            String userName = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/test";
            Class.forName ("com.mysql.cj.jdbc.Driver"); // This is the newest driver
            conn = DriverManager.getConnection (url, userName, password);
            System.out.println ("Database connection established");
            stmt = conn.createStatement();
            rs = stmt.executeQuery("Select * from javacourse");
            System.out.println("\n\n-------------Result before insert--------------\n");
            while (rs.next()) {
                NameString = rs.getString("Name");
                RollString = rs.getString("Roll");
                MarksString = rs.getString("Marks");
                GradeString = rs.getString("Grade");
                System.out.println("Name: " + NameString + "\t\t" + "Roll: " + RollString + "\t\t" + MarksString
                        + "\t\t" + GradeString + "\n");
            }
            rs.last();
            Num_Student = rs.getRow();
            avg_Marks = TotalMarks / Num_Student;

            System.out.println("\n\n----------AVERAGE marks = " + avg_Marks + "-----------");
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
