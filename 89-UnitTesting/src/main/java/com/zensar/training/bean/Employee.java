package com.zensar.training.bean;

public class Employee {
	
	double basicSalary;

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) throws InvalidSalaryException {
		if(basicSalary<0) {
			InvalidSalaryException ex=new InvalidSalaryException("Salary Can not be Negative");
			throw ex;
		}
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "Employee [basicSalary=" + basicSalary + "]";
	}
	
	public double computeAllowance() {
		
		return this.basicSalary*0.20;
	}

}
