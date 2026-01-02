package com.java.exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection() {
		
		String finalUrl = Constants.urlDriver + Constants.serverIp + ":" + Constants.serverPort + "/" + Constants.databaseName;
		
		System.out.println(finalUrl);

		try {
			Class.forName(Constants.driverName);

			Connection conn = DriverManager.getConnection(finalUrl, Constants.databaseUsername, Constants.databasePassword);
			System.out.println(conn);
			System.out.println("Database connected\n");
			return conn;
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
		
			e.printStackTrace();
			return null;
		}

	}

	public static void closeConnection(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
}