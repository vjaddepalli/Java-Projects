package com.zensar.training.bean;

public class CarLoan extends Loan {
	
	String registrationData;

	public CarLoan(double loanAmount, double tentureMonths,  String registrationData) {
		super(loanAmount,tentureMonths);
		this.registrationData = registrationData;
	}

	public CarLoan() {
		super();
	}

	public String getRegistrationData() {
		return registrationData;
	}

	public void setRegistrationData(String registrationData) {
		this.registrationData = registrationData;
	}

	@Override
	public int getInterestRate() {
		return 10;
	}

	
	
	
	

}
