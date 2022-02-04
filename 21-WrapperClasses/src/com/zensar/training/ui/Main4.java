package com.zensar.training.ui;

public class Main4 {

	public static void main(String[] args) {
		double d=800.00;
		
		Double obj=d; //auto boxing
		double d1=obj; //auto unboxing
		
		Double obj1=new Double(900.00);
		
		obj1++;
		System.out.println(obj1);
		

	}

}
