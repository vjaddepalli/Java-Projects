package com.zensar.training.bean;

public class Employee {

	public double basicSalary;

	public Employee() {
		System.out.println("Employee");
	}
	public double computeNetSalary() {
		System.out.println("Employee Compute NetSalary");
		return this.basicSalary + this.basicSalary * 0.35;
	}
	
}
