package com.zensar.training;





import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.zensar.training.bean.SimpleCalculator;

public class SimpleCalculatorTest {
	
	SimpleCalculator calculator;
	
	@BeforeClass
	public static void init0() {
		System.out.println("class loading");
	}
	
	
	
	@Before
	public void init() {
		calculator=new SimpleCalculator();
		System.out.println("Init...");
	}

	
	@Test
	public void testingAddFunction() {
		int expectedResults=30;
		int actual = calculator.add(15, 15);
		assertEquals(expectedResults, actual);
	}
	
	@After
	public void destroy() {
		calculator=null;
		System.out.println("Deleteing...");
	}
	
	@Test
	public void testingMultiply() {
		int expected=30;
		int actual=calculator.multiply(5, 6);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testingDivide() {
		int expected=30;
		int actual=calculator.divide(300, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testingSub() {
		int expected=-1;
		int actual=calculator.sub(5, 6);
		assertEquals(expected, actual);
	}
	
	
	
	
	@AfterClass
	public static void delete0() {
		System.out.println("class deleting");
	}

}
