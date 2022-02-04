package com.zensar.training.ui;

import com.zensar.training.bean.Employee;

public class EmpClient {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setName("john");
		emp.setBasicSalary(10000.00);
		emp.setGrade('B');
		
		System.out.println(emp.getAllowance());
		System.out.println(emp.getDeduction());

	}

}
