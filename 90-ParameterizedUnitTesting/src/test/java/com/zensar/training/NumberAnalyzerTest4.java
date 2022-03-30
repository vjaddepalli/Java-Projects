package com.zensar.training;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.zensar.training.bean.NumberAnalyzer;

@RunWith(Parameterized.class)
public class NumberAnalyzerTest4 {
	
	@Parameterized.Parameters
	public static Collection testData() {
		Object[][] data= {
				{12,true},
				{11,false},
				{20,true},
				{30,true}
		};
		return Arrays.asList(data);
	}
	
	int inputNumber;
	boolean expectedValue;
	NumberAnalyzer analyzer;
	
	public NumberAnalyzerTest4(int inputNumber, boolean expectedValue) {
		super();
		this.inputNumber = inputNumber;
		this.expectedValue = expectedValue;
	}
	
	@Before
	public void f1() {
		this.analyzer=new NumberAnalyzer();
	}
	
	@Test
	public void test() {
		
		this.analyzer.setNumber(inputNumber);
		assertEquals(expectedValue, this.analyzer.isEven());
	}
	
	@After
	public void f2() {
		this.analyzer=null;
	}

}
