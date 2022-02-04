package com.zensar.training.bean;

public class FactorialCalculator {
	
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int calculateFactorial() {
		
		int fact=1;
		
		for(int i=1;i<=number;i++) {
			
			fact=fact*i;
		}
		
		return fact;
	}

}
