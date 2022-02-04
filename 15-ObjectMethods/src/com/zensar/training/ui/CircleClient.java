package com.zensar.training.ui;

import com.zensar.training.bean.Circle;

public class CircleClient {

	public static void main(String[] args) {
		
		Circle c1;
		c1=new Circle();
		c1.setRadius(100);
		System.out.println(c1);
		
		Circle c2=new Circle();
		c2.setRadius(100);
		System.out.println(c2);
		
		int a=10, b=10;
		System.out.println(a==b);
		
		System.out.println(c1.equals(c2));

	}

}
