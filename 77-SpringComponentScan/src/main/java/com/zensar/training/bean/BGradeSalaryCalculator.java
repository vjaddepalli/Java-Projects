package com.zensar.training.bean;

import org.springframework.stereotype.Component;

@Component(value = "bGradeSalCal")
public class BGradeSalaryCalculator implements SalaryCalculator {

	public double computeAllowance(double basicSalary) {
		
		return basicSalary*0.30;
	}

	
	public double computeTax(double basic) {
		
		return basic*0.10;
	}

}
