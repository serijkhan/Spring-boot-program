package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class InsertBook {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url ="jdbc:mysql://localhost:3306/youtube";
			String username ="root";
			String password ="mantookhan@123";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			if(con.isClosed()) {
				System.out.println("Connection is closed");
			}else {
				System.out.println("Connection created...");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
