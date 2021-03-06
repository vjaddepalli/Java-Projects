package com.zensar.training.ui;

import java.time.LocalDate;
import java.util.function.Consumer;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Rectangle;
import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

public class Main1 {
	public static void main(String[] args) {
		Consumer<String> consumer1;

		consumer1 = (s) -> {
			System.out.println(s.length());
		};
		consumer1.accept("Zensar");

		Consumer<String> consumer2 = (s) -> System.out.println(s.toUpperCase());
		consumer2.accept("java");

		Consumer<Integer> consumer3 = (i) -> System.out.println(i.doubleValue());
		consumer3.accept(5);

		// circle
		Consumer<Circle> consumer4 = (c) -> System.out.println(c.computeArea());
		consumer4.accept(new Circle(10));
		Consumer<Circle> consumer5 = (c) -> System.out.println(c.getDiameter());
		consumer5.accept(new Circle(10));

		// square
		Consumer<Square> consumer6 = (s) -> System.out.println(s.calculateArea());
		consumer6.accept(new Square(8));
		Consumer<Square> consumer7 = (s) -> System.out.println(s.getSize());
		consumer7.accept(new Square(15));

		// employee
		Consumer<Employee> consumer8 = (e) -> System.out.println(e.toString());
		Employee emp = new Employee(5001, "Vijay", 'A', LocalDate.now(), 100, Gender.MALE);
		consumer8.accept(emp);
		Consumer<Employee> consumer9 = (e) -> System.out
				.println("Basic Salary: " + e.getBasicSalary() + ",  Allowance: " + e.computeAllowance());
		consumer9.accept(emp);

		// Rectangle
		Consumer<Rectangle> consumer10 = (r) -> System.out.println(r.getHeight());
		Rectangle r = new Rectangle(8, 9);
		consumer10.accept(r);

		// Student
		Consumer<Student> consumer11 = (s) -> System.out.println(s.getName());
		Student s = new Student(101, "Vijay", Gender.MALE, 85.6, "CSE");
		consumer11.accept(s);

	}
}
