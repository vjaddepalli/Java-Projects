package com.zensar.assignments.date;

public class DateMain {

	public static void main(String[] args) {
		Date date=new Date();
		date.setDay("23");
		date.setMonth("01");
		date.setYear("2022");
		
		Date date2=new Date();
		date2.setDay("24");
		date2.setMonth("01");
		date2.setYear("2022");
		
		date.swapTwoDates(date.printDate(), date2.printDate());

	}

}
