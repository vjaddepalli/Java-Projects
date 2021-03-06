package com.zensar.training.client;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main3 {

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

		// String SQL="update temployees set basic_salary=50000.00 where id=2";

		String name;
		LocalDate doj;
		char grade;
		double basic;
		char gender;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Name of Empployee:");
		name = sc.next();

		System.out.print("Enter DoJ dd-MMM-yyyy:");
		String temp = sc.next();
		doj = LocalDate.parse(temp, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));

		System.out.print("Enter Grade:");
		grade = sc.next().charAt(0);

		System.out.print("Enter Basic Salary:");
		basic = sc.nextDouble();

		System.out.print("Enter Gender:");
		gender = sc.next().charAt(0);

		String SQL = "insert into Temployees(name,doj,grade,basic_salary,gender) values(?,?,?,?,?)";

		PreparedStatement statement = null;

		try {
			statement = connection.prepareStatement(SQL);
			System.out.println("statement created successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			statement.setString(1, name);
			Date date = Date.valueOf(doj);
			statement.setDate(2, date);
			statement.setString(3, grade + "");
			statement.setDouble(4, basic);
			statement.setString(5, gender + "");

			int count = statement.executeUpdate();
			System.out.println(count);
		} catch (SQLException e) {

		}

		try {
			statement.close();
			connection.close();
			System.out.println("Resources Closed");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
