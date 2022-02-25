package com.zensar.training.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "employee")
public class Employee {

	int id;
	String name;
	double basicSalary;
	
	@Autowired
	@Qualifier(value = "bGradeSalCal")
	SalaryCalculator salaryCalculator;

	public Employee() {
		super();
	}

	public Employee(int id, String name, double basicSalary, SalaryCalculator salaryCalculator) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.salaryCalculator = salaryCalculator;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public SalaryCalculator getSalaryCalculator() {
		return salaryCalculator;
	}

	public void setSalaryCalculator(SalaryCalculator salaryCalculator) {
		this.salaryCalculator = salaryCalculator;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + ", salaryCalculator="
				+ salaryCalculator + "]";
	}
	
	public double getAllowance() {
		return this.salaryCalculator.computeAllowance(this.basicSalary);
	}
	
	public double getDeduction() {
		return this.salaryCalculator.computeTax(this.basicSalary);
	}

}
