package com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// Strp : 1 Loading drivers
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//step :2 Making connection with database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training", "Celcom123");
		
		//step : 3 creating statement
		//Normal and prepared Statement
		
//		String sql = "insert into kishore_employee values(?, ?, ?, ?)";
//		String sql ="delete pragathy_employee where eid = ?";
		String sql ="update pragathy_employee set ename = ? where eid =?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//step : 4	
//		ps.setInt(1, 50);
//		ps.setString(2, "RK");
//		ps.setInt(3, 200);
//		ps.setInt(4, 1);
		
//		ps.setInt(1, 12);
//		ps.setString(2, "Surya");
//		ps.setInt(3, 2000);
//		ps.setInt(4, 1);
		ps.setString(1,"pragy");
		ps.setInt(2,1);
		
		int n = ps.executeUpdate();//Insert,Delete,Upadate
		if(n == 1) {
			System.out.println("Employee record Inserted");
		}
		else {
			System.out.println("Employee record Not Inserted");
		}
		ps.close();
		con.close();
		
	}
}
