package com.learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection conn;
	final static String username="root";
	final static String password="root";
	final static String url="jdbc:mysql://localhost:3306/jdbc";
	public static Connection getConnection() {
		
		try {
			//Load the driver class
			Class.forName("com.mysql.jdbc.Driver");
			//create connection from driver manager
			conn=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
