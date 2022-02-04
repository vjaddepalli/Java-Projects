package com.zensar.training.bean;

public class HomeLoan extends Loan {

	String propertyLocation;

	public HomeLoan(double loanAmount, double tentureInMonths, String propertyLocation) {
		super(loanAmount, tentureInMonths);
		this.propertyLocation = propertyLocation;
	}

	public HomeLoan() {
		super();
	}

	public String getPropertyLocation() {
		return propertyLocation;
	}

	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}

	
	@Override
	public String toString() {
		return "HomeLoan [propertyLocation=" + propertyLocation + "]";
	}

	@Override
	public int getInterestRate() {
		return 7;
	}

}
