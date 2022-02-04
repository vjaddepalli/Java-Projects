package com.zensar.training.ui;

import com.zensar.training.bean.FactorialCalculator;
import com.zensar.training.bean.LeapYearDecider;
import com.zensar.training.bean.PrimeNumberDecider;

public class Main {

	public static void main(String[] args) {
		
		PrimeNumberDecider pnd=new PrimeNumberDecider();
		pnd.setNumber(5);
		System.out.println("Is Prime: "+pnd.isPrime());
		

		LeapYearDecider lyd=new LeapYearDecider();
		lyd.setYear(2020);
		System.out.println("Is Leap Year: "+lyd.isLeapYear());
		
		FactorialCalculator fc = new FactorialCalculator();
		fc.setNumber(7);
		System.out.println("Factorial of given number: "+fc.calculateFactorial());
		
		

	}

}
