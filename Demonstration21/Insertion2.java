import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class Insertion2 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String Name, Grade, NameString, RollString, MarksString, GradeString;
        int Roll, Marks; // corrected typo here
        try {
            String userName = "root";
            String password = "root";
            String url = "jdbc:mysql://localhost:3306/test";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, password);
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
            System.out.println("\n\n-----------Input for the entries of table (javacourse)------\n");
            Scanner in = new Scanner(System.in);
            System.out.print("Enter name: ");
            Name = in.nextLine();
            System.out.print("Enter grade: ");
            Grade = in.nextLine();
            System.out.print("Enter roll:");
            Roll = in.nextInt();
            System.out.print("Enter marks: ");
            Marks = in.nextInt(); // corrected typo here

            String qryString = "INSERT INTO javacourse (Roll, Name, Marks, Grade) VALUES(?, ?, ?, ?)";
            pstmt = conn.prepareStatement(qryString);
            pstmt.setInt(1, Roll);
            pstmt.setString(2, Name);
            pstmt.setInt(3, Marks); // corrected typo here
            pstmt.setString(4, Grade);
            pstmt.executeUpdate();
            System.out.println("\n\n-------------Result after insert--------");
            rs = stmt.executeQuery("Select * from javacourse");
            while (rs.next()) {
                NameString = rs.getString("Name");
                RollString = rs.getString("Roll");
                MarksString = rs.getString("Marks");
                GradeString = rs.getString("Grade");
                System.out.println("Name: " + NameString + "\t\t" + "Roll: " + RollString + "\t\t" + MarksString
                        + "\t\t" + GradeString + "\n");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("Vendor Error: " + ex.getErrorCode());
        } catch (Exception e) {
            System.err.println("Can't connect to database");
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) {
                    // TODO: handle exception
                    rs = null;
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                    stmt = null;
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException sqlEx) {
                    pstmt = null;
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    conn = null;
                }
            }
        }
    }
}
