package com.zensar.assignments.date;

public class Date {

	private String day;
	private String month;
	private String year;
	
	public Date() {
		super();		
	}

	public Date(String day, String month, String year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String  printDate() {
		String date=this.day+"/"+this.month+"/"+this.year;
		System.out.println("Date: "+date);
		return date;
	}
	
	public void swapTwoDates(String date1,String date2) {
		String temp;
		System.out.println("Before Swapping==>>>> Date-1: "+date1+" and  Date2: "+date2);
		temp=date1;
		date1=date2;
		date2=temp;
		System.out.println("After Swapping==>>>> Date-1: "+date1+" and  Date2: "+date2);
		
	}
	

}
