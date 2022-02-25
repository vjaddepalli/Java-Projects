package com.zensar.training.bean;

import org.springframework.stereotype.Component;

@Component(value = "aGradeSalCal")
public class AGradeSalaryCalculator implements SalaryCalculator {

	public double computeAllowance(double basicSalary) {
		
		return basicSalary*0.40;
	}

	public double computeTax(double basic) {
		
		return basic*0.20;
	}

}
