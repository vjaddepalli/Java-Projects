package com.zensar.training.bean;

import org.springframework.stereotype.Component;

@Component(value = "std")
public class Student {

	int rollNo;
	String name;
	double avgMark;

	public Student() {
		super();
	}

	public Student(int rollNo, String name, double avgMark) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.avgMark = avgMark;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAvgMark() {
		return avgMark;
	}

	public void setAvgMark(double avgMark) {
		this.avgMark = avgMark;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", avgMark=" + avgMark + "]";
	}

}
