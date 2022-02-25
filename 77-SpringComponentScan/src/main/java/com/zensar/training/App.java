package com.zensar.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Shape;
import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student student;
		student=(Student) context.getBean("std");
		System.out.println(student);
		
		Square square=(Square) context.getBean("square");
		System.out.println(square);
		
		Circle circle=(Circle) context.getBean("circle");
		System.out.println(circle);
		
		Employee employee=(Employee) context.getBean("employee");
		employee.setName("Vijay");
		employee.setId(101);
		employee.setBasicSalary(10000.0);
		
		System.out.println("Allowance: "+employee.getAllowance());
		System.out.println("Tax: "+employee.getDeduction());

	}
}
