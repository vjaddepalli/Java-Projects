package com.zensar.training.bean;

import java.util.Objects;

public class Student implements Comparable<Student> {
	int rollNo;
	String name, department;
	int marks;

	public Student(int rollNo, String name, String department, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.department = department;
		this.marks = marks;
	}

	public Student(int rollNo) {
		super();
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "\nStudent [rollNo=" + rollNo + ", name=" + name + ", department=" + department + ", marks=" + marks
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return rollNo == other.rollNo;
	}

	@Override
	public int compareTo(Student o) {
		if (this.rollNo < o.rollNo)
			return -1;
		else if (this.rollNo > o.rollNo)
			return 1;
		return 0;
	}
}
