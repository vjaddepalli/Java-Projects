package com.zensar.training.bean;

import java.io.IOException;

public class AGradeSalaryCalculator implements SalaryCalculator {

	//interfaces also have to throw exceptions 
	//if implemented class throws any exception
	
	@Override
	public double computeAllowance(double basic) throws Exception {
		if(basic<0) {
			InvalidSalaryException exception=new InvalidSalaryException("Invalid Salary");
			throw exception;
		}
		return 0;
	}

}
