package com.zensar.training.bean;

public class PrimeNumberDecider {
	

	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public boolean isPrime() {
		
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				System.out.println("prime");
				return false;
			}
		}
		return true;
	}
	
	

}
