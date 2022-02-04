package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Executable;
import com.zensar.training.bean.Rectangle;
import com.zensar.training.bean.Student;

public class Main5 {

	public static void main(String[] args) {
		
		Executable<String> executable1;
		
		executable1=(s)->{
			return s.length();
		};
		
		System.out.println(executable1.execute("Welcome"));
		
		Executable<Double> executable2;
		executable2=(obj)->{
			System.out.println(obj.intValue());
			return obj.intValue();
		};
		
		Executable<Circle> executable3;
		executable3=(obj)->obj.getRadius();
		System.out.println(executable3.execute(new Circle(5)));
		
		Executable<Student> executable4;
		executable4=(obj)->obj.getRollNo();
		System.out.println(executable4.execute(new Student(1101)));
		
		Executable<Rectangle> executable5;
		executable5=(obj)->obj.getArea();
		System.out.println(executable5.execute(new Rectangle(5, 3)));
	

	}

}
