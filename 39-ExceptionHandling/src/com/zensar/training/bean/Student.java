package com.zensar.training.bean;

public class Student implements Comparable<Student>{
	int rollNo;
	String name,department;
	int marks;
	
	public Student(int rollNo, String name, String department, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.department = department;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "\nStudent [rollNo=" + rollNo + ", name=" + name + ", department=" + department + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		if(this.rollNo<o.rollNo)
			return -1;
		else if(this.rollNo>o.rollNo)
			return 1;
		return 0;
	}
}
