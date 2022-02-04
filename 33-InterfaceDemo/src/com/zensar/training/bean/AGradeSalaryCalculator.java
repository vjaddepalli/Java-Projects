package com.zensar.training.bean;

public class AGradeSalaryCalculator implements SalaryCalculator {

	@Override
	public double computeAllowance(double basicSalary) {
		Calculator calc = new Calculator();
		return calc.multiple(basicSalary,0.40);
	}

	@Override
	public double computeTax(double basicSalary) {
		Calculator calc = new Calculator();
		return calc.multiple(basicSalary,0.25);
	}

	@Override
	public double computeNetSalary(double basicSalary) {

		Calculator calc = new Calculator();
		double sum=calc.add(basicSalary,this.computeAllowance(basicSalary));
		double res=calc.subtract(sum, this.computeTax(basicSalary));
		return res;
	}

}
