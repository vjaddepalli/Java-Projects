package com.zensar.training.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {

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

		// step3: queries
		Statement statement = null;
		try {
			statement = connection.createStatement();
			System.out.println("Satement Created");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		String SQL = "select * from temployees";

		ResultSet rs = null;

		try {
			rs = statement.executeQuery(SQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			while (rs.next()) {

				System.out.print(rs.getInt(1) + " , ");
				System.out.print(rs.getString(2) + " , ");

				java.sql.Date doj = rs.getDate(3);
				long ms = doj.getTime();
				java.util.Date udoj = new java.util.Date(ms);
				System.out.print(udoj + " , ");

				System.out.print(rs.getString(4).charAt(0) + " , ");
				System.out.print(rs.getDouble(5) + " , ");
				System.out.println(rs.getString(6).charAt(0));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// step4:
		try {
			statement.close();
			rs.close();
			connection.close();
			System.out.println("Resources Closed");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
