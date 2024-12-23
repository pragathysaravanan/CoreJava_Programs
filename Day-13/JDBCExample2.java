package com.day13;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCExample2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Strp : 1 Loading drivers

		Class.forName("oracle.jdbc.driver.OracleDriver");

		// step :2 Making connection with database
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com",
				"training", "Celcom123");
		DatabaseMetaData dbData = con.getMetaData();
		System.out.println(dbData.getDatabaseProductName());
		System.out.println(dbData.getDatabaseProductVersion());
		System.out.println(dbData.getDriverName());

		// step : 3 creating statement
		// Normal and prepared Statement

		String sql = "insert into pragathy_employee values(?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);

		// step : 4 Executing the query
		Object employee[][] = new Object[][] {
			{15,"Malli",5000,2},
			{16,"Devi",5000,1},
			{17,"Vidhya",5000,3},
		};
		for (int i = 0;i<employee.length;i++) {
			ps.setInt(1, (Integer)employee[i][0]);
			ps.setString(2,  (String)employee[i][1]);
			ps.setInt(3, (Integer)employee[i][2]);
			ps.setInt(4, (Integer)employee[i][3]);
			ps.addBatch();
		}
//		ps.setInt(1, 14);
//		ps.setString(2, "Jai");
//		ps.setInt(3, 200);
//		ps.setInt(4, 2);
//		ps.addBatch();
//
//		ps.setInt(1, 13);
//		ps.setString(2, "Vanchi");
//		ps.setInt(3, 2000);
//		ps.setInt(4, 3);
//		ps.addBatch();

		// step : 4
		ps.executeBatch();
		System.out.println("Employee Patchrd successfully");

		// rs.close();
		ps.close();
		con.close();

	}
}
