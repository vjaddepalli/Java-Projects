package com.zensar.training.ui;

import java.time.LocalDate;
import java.util.function.ToDoubleFunction;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Student;

public class Main5 {

	public static void main(String[] args) {

		ToDoubleFunction<Student> function1;
		function1 = (s) -> s.getAverageMark();
		System.out.println(function1.applyAsDouble(new Student(101, "Vijay", Gender.MALE, 89.00, "CSE")));
		
		ToDoubleFunction<Circle> function2;
		function2=(c)->c.computeArea();
		System.out.println(function2.applyAsDouble(new Circle(10)));
		
		ToDoubleFunction<Employee> function3;
		function3=(e)->e.computeAllowance();
		System.out.println(function3.applyAsDouble(new Employee(101, "Vijay", 'A', LocalDate.now(), 35000.00, Gender.MALE)));

	}

}
