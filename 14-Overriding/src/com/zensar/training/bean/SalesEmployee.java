package com.zensar.training.bean;

public class SalesEmployee extends Employee{
	
	public double salesCommision;
	
	public double computeNetSalary() {
		System.out.println("Sales Employee Compute NetSalary");
		return this.basicSalary + this.basicSalary * 0.35+salesCommision;
	}

}
