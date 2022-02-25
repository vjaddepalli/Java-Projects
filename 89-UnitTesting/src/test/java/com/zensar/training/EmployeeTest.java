package com.zensar.training;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.InvalidSalaryException;

public class EmployeeTest {
	
	Employee employee;
	
	@Before
	public void init() {
		
		employee=new Employee();
		System.out.println("---init before test----");
	}
	

	@Test
	public void computeAllowanceWithPositve1() throws InvalidSalaryException {
		employee.setBasicSalary(1000);
		double expected=200.0;
		double actual=employee.computeAllowance();
		assertEquals(expected, actual, actual);
		
	}
	
	@Test
	public void computeAllowanceWithPositve2() throws InvalidSalaryException {
		employee.setBasicSalary(10000);
		double expected=2000.0;
		double actual=employee.computeAllowance();
		assertEquals(expected, actual, actual);
		
	}
	
	@Test
	public void computeAllowanceWithNegative1() throws InvalidSalaryException {
		employee.setBasicSalary(-1000);
		double expected=-200.0;
		double actual=employee.computeAllowance();
		assertEquals(expected, actual, actual);
		
	}
	
	@Test
	public void computeAllowanceWithNegative2() throws InvalidSalaryException {
		employee.setBasicSalary(-100);
		double expected=-20.0;
		double actual=employee.computeAllowance();
		assertEquals(expected, actual, actual);
		
	}
	
	@After
	public void destroy() {
		employee=null;
		System.out.println("----init after test -----");
	}

}
