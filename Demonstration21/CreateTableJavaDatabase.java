import java.sql.*;
public class CreateTableJavaDatabase{
	public static void main(String[] args) throws Exception{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String TableName;
		
		try{
			String userName = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/test";
			Class.forName("com.mysql.cj.jdbc.Driver"); // updated driver class
			conn = DriverManager.getConnection(url, userName, password);
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SHOW TABLES"); // changed from execute to executeQuery
			System.out.println("Result before creating table");
			
			while(rs.next()){
				TableName = rs.getString(1); // changed from "JavaCourse" to 1
				System.out.println("Table Name:  " + TableName + "\n");
			}
			stmt.execute("CREATE TABLE IF NOT EXISTS JAVACOURSE(Roll INTEGER PRIMARY KEY, Name VARCHAR(30), Marks INTEGER NOT NULL, Grade VARCHAR(2))"); // added IF NOT EXISTS to avoid error if table already exists
			rs = stmt.executeQuery("SHOW TABLES"); // changed from execute to executeQuery
			System.out.println("Result after creating table \n");
			
			while(rs.next()){
				TableName = rs.getString(1); // changed from "MyTables" to 1
				System.out.println("Table Name:  " + TableName + "\n");
			}
		} catch(SQLException e){
			System.out.println("Can not connect to the server..");
		}
		
		finally{
			if(rs != null){
				try{
					rs.close();
				} catch(SQLException sqlEX){/* ignore any code here*/}
				rs = null;
			}
			if(stmt != null){
				try{
					stmt.close();
				} catch(SQLException sqlEX){/*ignore code for this*/}
				stmt = null;
			}
			if(conn != null){
				try{
					conn.close();
				} catch(SQLException e){/* Ignore code for this closing errors*/ }
			}
		}
	}
}
