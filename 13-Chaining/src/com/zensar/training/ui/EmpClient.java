package com.zensar.training.ui;

import com.zensar.training.bean.Employee;

public class EmpClient {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setSalary(9000);
		
		System.out.println(employee.computeNetSalary());

	}

}
