package com.zensar.training.bean;

import java.util.Objects;

public abstract class Loan {

	double loanAmount;
	double tentureInMonths;

	public Loan(double loanAmount, double tentureInMonths) {
		super();
		this.loanAmount = loanAmount;
		this.tentureInMonths = tentureInMonths;
	}

	public Loan() {
		super();
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getTentureInMonths() {
		return tentureInMonths;
	}

	public void setTentureInMonths(double tentureInMonths) {
		this.tentureInMonths = tentureInMonths;
	}

	@Override
	public String toString() {
		return "Loan [loanAmount=" + loanAmount + ", tentureInMonths=" + tentureInMonths + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(loanAmount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Loan))
			return false;
		Loan other = (Loan) obj;
		return Double.doubleToLongBits(loanAmount) == Double.doubleToLongBits(other.loanAmount);
	}
	
	abstract public int getInterestRate();

	public double getInterestAmount() {
		return this.loanAmount*this.tentureInMonths*this.getInterestRate()/100;
	}
}
