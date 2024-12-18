package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Fun {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/youtube";
			String username="root";
			String password="mantookhan@123";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			String query = "create table table1(tId int(20) primary Key auto_increment, tName varchar(200) not null, tCity varchar(300))";
			
			Statement  stmt = con.createStatement();
			
			stmt.executeUpdate(query);
			System.out.println("Table is created...");
			
			con.close();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
