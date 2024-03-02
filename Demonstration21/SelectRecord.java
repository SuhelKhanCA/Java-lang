/*
A program to select all data present in a table and calculate average marks
*/

import java.sql.*;
import java.sql.ResultSet;
public class SelectRecord   {
	public static void main (String[] args){
		Connection conn = null;
		Statement stmt = null; 
		ResultSet rs = null;
		int TotalMarks=0, Num_Student=0; 
		float Avg_Marks;
		String NameString, RollString, MarksString, GradeString;
		try{
			String userName = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/test";
			Class.forName ("com.mysql.cj.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection (url, userName, password);
			stmt = conn.createStatement();  
			stmt.execute("SELECT * FROM JavaCourse");
			rs = stmt.getResultSet();
			System.out.println("\n\n -------  Results  ---------\n");
			while (rs.next()) {
			NameString = rs.getString("Name");
			RollString = rs.getString("Roll");
			MarksString = rs.getString("Marks");
			GradeString = rs.getString("Grade");	
			TotalMarks = TotalMarks + Integer.parseInt(MarksString);
			System.out.println("Name: = "+NameString+"\t\t"+"Roll: = "+RollString+"\t\t"+"Marks: = "+MarksString+"\t\t"+"Grade: = "+GradeString+"\n");
			} //end while
			rs.last();
			Num_Student = rs.getRow();
			Avg_Marks = TotalMarks / Num_Student; 
			System.out.println("\n\n ------- AVERAGE Marks = "+Avg_Marks+"--------");
		}
		catch (SQLException ex){
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		catch (ArithmeticException e) {
			System.out.println("Division by zero.");
		} 
		catch (Exception e) {
			System.err.println ("Cannot connect to database server");
		}
		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqlEx) { } // ignore
				rs = null;
			}
			if (conn != null) {
				try {
					conn.close ();
				// System.out.println ("Database connection terminated");
				}
				catch (Exception e) { /* ignore close errors */ }
			}
		}
	}
} 