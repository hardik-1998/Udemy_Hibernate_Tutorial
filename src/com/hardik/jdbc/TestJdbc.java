package com.hardik.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String JdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "root";
		String pass="root";
		
		try {
			Connection myconnection = 
					DriverManager.getConnection(JdbcUrl, user, pass);
			System.out.println("connection successfull!!");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
