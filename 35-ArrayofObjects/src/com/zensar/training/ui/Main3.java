package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Square;

public class Main3 {

	public static void main(String[] args) {
		Object obj;
		obj=new Circle(5); //upcasting implicitly
		
		Circle temp=(Circle) obj; //downcasting explicitly
		System.out.println(temp.getRadius()+", "+temp.computeArea());
		
		obj=new Square(10); //upcast
		Square tempSquare=(Square) obj; //downcast
		System.out.println(tempSquare.getSize()+", "+tempSquare.calculateArea());
		
		obj=new String("Welcome");
		String str=(String) obj;
		System.out.println(str.toUpperCase());
		
		obj=new Integer(10);
		Integer tempInt = (Integer) obj;
		System.out.println(tempInt.doubleValue());
		
		obj=new Double(90.00);
		Double tempDouble=(Double) obj;
		System.out.println(tempDouble.intValue());
		
		Object obj1=new Circle(90);
		//Square square=(Square) obj1; //class cast exception
		
		System.out.println(obj1 instanceof Circle );
		if(obj1 instanceof Circle) {
			Circle tmp=(Circle) obj1;
			System.out.println(tmp);
		}
		
		if(obj1 instanceof Square) {
			Square tmp=(Square) obj1;
			System.out.println(tmp.calculateArea());
		}
		
		

	}

}
