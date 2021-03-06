package com.zensar.training.client;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main1 {

	public static void main(String[] args) {

		// Step1: load driver class
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// Step2: Connect to Database
		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306/TrainingDB";
		String username = "root";
		String password = "root";

		try {
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection established");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// step3: Run queries
		//String SQL = "insert into Temployees(name,doj,grade,basic_salary,gender) values('Lisa','2020-02-02','C',18000.00,'F')";
		//String SQL="update temployees set basic_salary=50000.00 where id=2";
		//String SQL="delete from temployees where id=2";
		String SQL="select * from temployees";
		Statement statement = null;
		try {
			statement = connection.createStatement();
			System.out.println("statement created");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		int count;
		try {
			count = statement.executeUpdate(SQL);
			System.out.println(count);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// step4: closing statement and resources

		try {
			statement.close();
			connection.close();
			System.out.println("Resources closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
