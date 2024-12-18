package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Jdbcprogram {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url= "jdbc:mysql://localhost:3306/youtube";
			String username="root";
			String password="mantookhan@123";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			String query="insert into table1(tName,tCity) values(?,?)";
			
			PreparedStatement ptstmt = con.prepareStatement(query);
			ptstmt.setString(1, "Mantoo");
			ptstmt.setString(2, "Delhi");
			
			ptstmt.executeUpdate();
			
			System.out.println("Inserted into DB...");
			
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
