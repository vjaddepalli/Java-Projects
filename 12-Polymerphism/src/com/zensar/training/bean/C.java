package com.zensar.training.bean;

public class C {

	public void printSum(int... arr) {
		int sum=0;
		for(int element:arr) {
			sum +=element;			
		}
		System.out.println("Sum: "+sum);
	}
}
