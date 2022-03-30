package com.zensar.training;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.zensar.training.bean.NumberAnalyzer;

public class NumberAnalyzerTest {
	
	NumberAnalyzer analyzer;
	
	@Before
	public void f1() {
		this.analyzer=new NumberAnalyzer();
	}
	
	@Test
	public void test1() {
		boolean expected=true;
		this.analyzer.setNumber(13);
		boolean actual=analyzer.isPrimeNumber();
		assertEquals(expected, actual);
	}
	
	@Test
	public void test2() {
		boolean expected=false;
		this.analyzer.setNumber(27);
		boolean actual=analyzer.isPrimeNumber();
		assertEquals(expected, actual);
	}
	
	@Test
	public void test3() {
		boolean expected=true;
		this.analyzer.setNumber(17);
		boolean actual=analyzer.isPrimeNumber();
		assertEquals(expected, actual);
	}
	
	@After
	public void f2() {
		analyzer=null;
	}

}
