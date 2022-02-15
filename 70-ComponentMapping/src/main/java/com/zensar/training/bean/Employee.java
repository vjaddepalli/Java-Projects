package com.zensar.training.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees20")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int empId;
	
	@Column(name = "e_name")
	String name;
	
	@Column(name = "e_grade")
	char grade;
	
	@Column(name = "e_salary")
	double basicSalary;
	
	@Column(name = "e_doj")
	LocalDate dateOfJoining;
	
	@Embedded
	Address address;

	public Employee(String name, char grade, double basicSalary, LocalDate dateOfJoining) {
		super();
		this.name = name;
		this.grade = grade;
		this.basicSalary = basicSalary;
		this.dateOfJoining = dateOfJoining;
	}

	public Employee(String name, char grade, double basicSalary, LocalDate dateOfJoining, Address address) {
		super();
		this.name = name;
		this.grade = grade;
		this.basicSalary = basicSalary;
		this.dateOfJoining = dateOfJoining;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", grade=" + grade + ", basicSalary=" + basicSalary
				+ ", dateOfJoining=" + dateOfJoining + ", address=" + address + "]";
	}

}
