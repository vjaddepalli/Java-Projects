package com.zensar.training.bean;

public class LeapYearDecider {

	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isLeapYear() {
		
		if(year%4==0) {
			
			if(year%100 != 0) {
				return true;
			}
			
		}else if(year%400==0) {
			return true;
		}
		return false;
	}

}
