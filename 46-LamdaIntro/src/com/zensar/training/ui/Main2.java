package com.zensar.training.ui;

import com.zensar.training.bean.SalaryCalculator;

public class Main2 {

	public static void main(String[] args) {
		
		SalaryCalculator salCalc;
		
		salCalc = new SalaryCalculator() {
			
			@Override
			public double computeTax(double basic) {
				// TODO Auto-generated method stub
				return basic*0.10;
			}
			
			@Override
			public double computeAllowance(double basic) {
				// TODO Auto-generated method stub
				return basic*0.35;
			}
		};
		
		System.out.println(salCalc.computeAllowance(1000));
		System.out.println(salCalc.computeTax(1000));
		
		salCalc=new SalaryCalculator() {
			
			@Override
			public double computeTax(double basic) {
				// TODO Auto-generated method stub
				return 0.06*basic;
			}
			
			@Override
			public double computeAllowance(double basic) {
				// TODO Auto-generated method stub
				return 0.30*basic;
			}
		};
		
		System.out.println(salCalc.computeAllowance(1000));
		System.out.println(salCalc.computeTax(1000));
		
		salCalc = new SalaryCalculator() {
			
			@Override
			public double computeTax(double basic) {
				// TODO Auto-generated method stub
				return 0.40*basic;
			}
			
			@Override
			public double computeAllowance(double basic) {
				// TODO Auto-generated method stub
				return 0.20*basic;
			}
		};
		
		System.out.println(salCalc.computeAllowance(1000));
		System.out.println(salCalc.computeTax(1000));

	}

}
