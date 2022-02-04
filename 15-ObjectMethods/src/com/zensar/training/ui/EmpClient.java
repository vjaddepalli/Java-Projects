package com.zensar.training.ui;

import com.zensar.training.bean.Employee;

public class EmpClient {

	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "Vijay", 10000.00);
		Employee emp2 = new Employee(101, "Mahesh", 20000.00);

		System.out.println(emp1.equals(emp2));
		

	}

}
