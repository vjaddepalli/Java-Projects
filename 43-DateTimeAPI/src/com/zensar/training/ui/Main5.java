package com.zensar.training.ui;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;

public class Main5 {

	public static void main(String[] args) {
		
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2022, 07, 28);
		
		//gap between two dates
		int months=Period.between(date1, date2).getMonths();
		System.out.println(months);
		
		Year year=Year.of(2019);
		Period period=Period.ofYears(25);
		year=year.plus(period);
		System.out.println(year);
		
		LocalTime locaTime1=LocalTime.now();
		LocalTime localTime2=LocalTime.of(02, 30, 30);
		System.out.println(Duration.between(localTime2 , locaTime1).getSeconds());
		
		

	}

}
