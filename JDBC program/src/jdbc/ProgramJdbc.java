package jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProgramJdbc {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url ="jdbc:mysql://localhost:3306/youtube";
			String username="root";
			String password="mantookhan@123";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			String query="insert into table1(tName,tCity) values(?,?)";
			
			PreparedStatement ptstmt = con.prepareStatement(query);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your name:");
			String name =br.readLine();
			System.out.println("Enter you City:");
			String city = br.readLine();
			
			ptstmt.setString(1, name);
			ptstmt.setString(2, city);
			ptstmt.executeUpdate();
			
			
			System.out.println("Inserted into DB...");
			
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
