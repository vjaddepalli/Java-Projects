package com.zensar.training.bean;

public class NumberAnalyzer {
	
	private int number;

	public NumberAnalyzer() {
		super();
	}

	public NumberAnalyzer(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public boolean isPrimeNumber() {
		boolean result=true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				result=false;
				break;
			}
		}
		return result;
	}
	
	public boolean isOdd() {
		if(this.number%2!=0)
			return true;
		return false;
	}
	
	public boolean isEven() {
		if(this.number%2==0)
			return true;
		else
			return false;
	}
	
	

}
