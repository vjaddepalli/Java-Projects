package com.zensar.training.ui;

import java.util.function.Supplier;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Rectangle;
import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

public class Main2 {

	public static void main(String[] args) {
		// supplier interface
		Supplier<Integer> supplier1;
		supplier1 = () -> new Integer(100);
		System.out.println(supplier1.get());

		Supplier<Circle> supplier2 = () -> new Circle(25);
		System.out.println(supplier2.get().getRadius());

		Supplier<Object> supplier3;
		supplier3 = () -> new Square(5);
		System.out.println(supplier3.get());

		supplier3 = () -> new Rectangle(5, 2);
		System.out.println(supplier3.get());

	}

}
