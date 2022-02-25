package com.zensar.training;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.InvalidSalaryException;

public class EmpoyeeTester {
	
Employee employee;
	
	@Before
	public void init() {
		
		employee=new Employee();
		System.out.println("---init before test----");
	}
	
	@Test
	public void test1() {
		
		
		
	}
	
	
	@After
	public void destroy() {
		employee=null;
		System.out.println("----init after test -----");
	}

}
