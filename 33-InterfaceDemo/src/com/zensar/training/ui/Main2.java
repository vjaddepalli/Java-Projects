package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Shape;
import com.zensar.training.bean.Square;

public class Main2 {

	public static void main(String[] args) {
		
		Circle c1=new Circle(10);
		System.out.println(c1.getRadius());
		System.out.println(c1.calculateArea());
		
		Square s1=new Square(20);
		System.out.println(s1.getSize());
		System.out.println(s1.computeArea());
		
		Shape shape=new Square(25);
		shape.setSize(25);
		System.out.println(shape.getArea());

	}

}
