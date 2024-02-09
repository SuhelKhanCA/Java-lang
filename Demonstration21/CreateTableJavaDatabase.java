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
			// may throw error
			Class.forName("com.mysql.jdbc.Driver"); // new wayy
			conn = DriverManager.getConnection(url, userName, password);
			
			stmt = conn.createStatement();
			stmt.execute("SHOW TABLES");
			rs = stmt.getResultSet();
			System.out.println("Result before creating table");
			
			while(rs.next()){
				TableName = rs.getString("JavaCourse"); // to create a table named javacourse
				System.out.println("Table Name:  " + TableName + "\n");
			}
			stmt.execute("CREATE TABLE JAVACOURSE(Roll INTEGER PRIMARY KEY, Name VARCHAR(30), Marks INTEGER NOT NULL, Grade VARCHAR(2))");
			stmt.execute("SHOW TABLES");
			rs = stmt.getResultSet();
			System.out.println("Result after creating table \n");
			
			while(rs.next()){
				TableName = rs.getString("MyTables");
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