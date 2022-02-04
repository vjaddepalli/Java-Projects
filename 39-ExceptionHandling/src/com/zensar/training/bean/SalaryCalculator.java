package com.zensar.training.bean;

public interface SalaryCalculator {
	//interfaces also have to throw exceptions 
	//if implemented class throws any exception
	double computeAllowance(double basic) throws Throwable;

}
