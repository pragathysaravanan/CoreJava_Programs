package com.tms.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getDBConnection() {

		Connection con = null;
		try {
			// Strp : 1 Loading drivers

			Class.forName("oracle.jdbc.driver.OracleDriver");

			// step :2 Making connection with database
			con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training",
					"Celcom123");
		} catch (ClassNotFoundException e) {
			System.out.println("Could not load the drivers");
		} catch (SQLException e) {
			System.out.println("Could not connect with the DB");
		}
		return con;
	}
}
