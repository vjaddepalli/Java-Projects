package com.zensar.training;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.zensar.training.bean.Calculator;

public class CalculatorTest {

	Calculator calculator;

	@Before
	public void init() {
		calculator = new Calculator();
		System.out.println("...init before test...");
	}

	@Test
	public void addTestWithPositive() {
		calculator.setNumber1(10);
		calculator.setNumber2(20);
		int expected = 30;
		int actual = calculator.sum();
		assertEquals(expected, actual);
	}
	
	@Test
	public void addTestWithNegative() {
		calculator.setNumber1(-10);
		calculator.setNumber2(20);
		int expected = 10;
		int actual = calculator.sum();
		assertEquals(expected, actual);
	}
	
	@Test
	public void subTestWithPositive() {
		calculator.setNumber1(20);
		calculator.setNumber2(20);
		int expected=0;
		int actual=calculator.sub();
		assertEquals(expected, actual);
	}
	
	@Test
	public void subTestWithNegative() {
		calculator.setNumber1(-20);
		calculator.setNumber2(-30);
		int expected=10;
		int actual=calculator.sub();
		assertEquals(expected, actual);
	}
	
	@Test
	public void mulTestWithPositive() {
		calculator.setNumber1(5);
		calculator.setNumber2(3);
		int expected=15;
		int actual=calculator.mul();
		assertEquals(expected, actual);
	}
	
	@Test
	public void mulTestWithNegative() {
		calculator.setNumber1(-5);
		calculator.setNumber2(3);
		int expected=-15;
		int actual=calculator.mul();
		assertEquals(expected, actual);
	}
	
	@Test
	public void divTestWithPositive() {
		calculator.setNumber1(10);
		calculator.setNumber2(2);
		int expected=5;
		int actual=calculator.div();
		assertEquals(expected, actual);
	}
	
	@Test
	public void divTestWithNegative() {
		calculator.setNumber1(-10);
		calculator.setNumber2(-2);
		int expected=5;
		int actual=calculator.div();
		assertEquals(expected, actual);
	}

	@After
	public void destroy() {
		calculator = null;
		System.out.println(".....inti after test........");
	}

}
