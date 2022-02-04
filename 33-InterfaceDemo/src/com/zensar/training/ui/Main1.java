package com.zensar.training.ui;

import com.zensar.training.bean.AGradeSalaryCalculator;
import com.zensar.training.bean.BGradeCalculator;
import com.zensar.training.bean.CGradeCalculator;
import com.zensar.training.bean.SalaryCalculator;

public class Main1 {

	public static void main(String[] args) {

		SalaryCalculator salaryCalculator;

		salaryCalculator = new AGradeSalaryCalculator();
		System.out.println(salaryCalculator.computeAllowance(10000));
		System.out.println(salaryCalculator.computeTax(10000));
		System.out.println(salaryCalculator.computeNetSalary(10000));

		salaryCalculator = new BGradeCalculator();
		System.out.println(salaryCalculator.computeAllowance(10000));
		System.out.println(salaryCalculator.computeTax(10000));
		System.out.println(salaryCalculator.computeNetSalary(10000));

		salaryCalculator = new CGradeCalculator();
		System.out.println(salaryCalculator.computeAllowance(10000));
		System.out.println(salaryCalculator.computeTax(10000));
		System.out.println(salaryCalculator.computeNetSalary(10000));

	}

}
