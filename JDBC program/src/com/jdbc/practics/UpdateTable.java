package com.jdbc.practics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.jdbc.practics.ConnectionProvider;

public class UpdateTable {
	
	public static void main(String[] args) {
		try {
			Connection con = ConnectionProvider.getConnection();
			
			String q = "update table1 set tName=?, tCity=? where tId=?";
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter new name:");
			String name = br.readLine();
			
			System.out.println("Enter new city:");
			String city = br.readLine();
			
			System.out.println("Enter new id:");
			int id = Integer.parseInt(br.readLine());
			
			PreparedStatement ptstmt = con.prepareStatement(q);
			ptstmt.setString(1,name);
			ptstmt.setString(2,city);
			ptstmt.setInt(3,id);
			ptstmt.executeUpdate();
			System.out.println("done........");
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
