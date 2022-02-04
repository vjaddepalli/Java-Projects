package com.zensar.training.ui;

import java.util.Arrays;



public class Main3 {

	public static void main(String[] args) {
		String[] cities=new String[] {"Delhi","Hyderabad","Chennai","Pune"}; 
		
		String str=Arrays.toString(cities);
		System.out.println(str);
		
		Arrays.sort(cities);
		System.out.println(Arrays.toString(cities));
		
		System.out.println(Arrays.binarySearch(cities,"Delhi"));
		
	

	}

}
