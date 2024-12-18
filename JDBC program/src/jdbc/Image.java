package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Image {
	
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","mantookhan@123");
			
			String query = "insert into Image(pic) values(?)";
			
			PreparedStatement ptstmt = con.prepareStatement(query);
			
			FileInputStream fis = new FileInputStream("C:\\Users\\myfat\\OneDrive\\Pictures\\Screenshots\\images.jpeg");
			
			ptstmt.setBinaryStream(1, fis,fis.available());
			
			ptstmt.executeUpdate();
			
			System.out.println("done");
			
			
		}catch(Exception e) {
			
			e.printStackTrace();
			System.out.println("Error");
		}
	}

}
