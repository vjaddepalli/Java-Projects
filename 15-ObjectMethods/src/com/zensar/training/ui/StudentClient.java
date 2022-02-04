package com.zensar.training.ui;

import com.zensar.training.bean.Student;

public class StudentClient {

	public static void main(String[] args) {
		Student std = new Student();
		std.name = "John";
		std.mark = 87;
		std.grade = 'A';

		System.out.println(std.toString());

		Student std1 = new Student();
		std1.name = "Ravi";
		std1.mark = 98;
		std1.grade = 'A';

		System.out.println(std.equals(std1));

		std = null;
		System.gc();
	}

}
