package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.ObjectStackImpl;
import com.zensar.training.bean.Square;

public class Main7 {

	public static void main(String[] args) {
		ObjectStackImpl<Circle> impl=new ObjectStackImpl<Circle>(10);
		
		impl.push(new Circle(25));
		impl.push(new Circle(15));
		impl.push(new Circle(10));
		
		System.out.println(impl);
		
		Circle c= impl.pop();
		System.out.println(c.getRadius()+" , "+c.computeArea());
		
		ObjectStackImpl<String> imp=new ObjectStackImpl<String>(3);
		imp.push("Welcome");
		imp.push("Good Bye");
		imp.push("Java");
		
		String s1=imp.pop();
		System.out.println(s1.toUpperCase());
		
		ObjectStackImpl<Square> impl2=new ObjectStackImpl<Square>(5);
		impl2.push(new Square(25));
		impl2.push(new Square(35));
		impl2.push(new Square(45));
		impl2.push(new Square(55));
		impl2.push(new Square(65));
		
		Square s = impl2.pop();
		System.out.println(s.getSize()+" , "+s.calculateArea());
		
		ObjectStackImpl<Double> impl3=new ObjectStackImpl<Double>(3);
		impl3.push(new Double(25.0));
		impl3.push(30.0);
		impl3.push(20.0);
		
		Double d=impl3.pop();
		System.out.println(d.intValue());
		
		ObjectStackImpl<Integer> impl4=new ObjectStackImpl<Integer>(3);
		impl4.push(25);
		impl4.push(28);
		impl4.push(new Integer(15));
		
		Integer i=impl4.pop();
		System.out.println(i.doubleValue());
		
		
		
		

	}

}
