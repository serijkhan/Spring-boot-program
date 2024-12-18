package com.jdbc.practics;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			Connection c = ConnectionProvider.getConnection();
			String q = "insert into image(pic) values(?)";
			
			PreparedStatement ptstmt = c.prepareStatement(q);
			
			JFileChooser jfc = new JFileChooser();
			
			jfc.showOpenDialog(null);
			
			File file = jfc.getSelectedFile();
			
			FileInputStream fis = new FileInputStream(file);
			
			ptstmt.setBinaryStream(1,fis,fis.available());
			
			ptstmt.executeUpdate();
			
			JOptionPane.showMessageDialog(null,"success");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
