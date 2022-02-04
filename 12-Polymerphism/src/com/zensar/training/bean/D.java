package com.zensar.training.bean;

public class D {

	public static void main(String[] args) {
		
		C obj = new C();
		int[] ages= {24, 21, 56, 33, 67};
		obj.printSum(ages);
		
		obj.printSum(new int[] {1,2,3});
		obj.printSum(12,22);
		obj.printSum(12,33,44,55,66);
		obj.printSum();
		

	}

}
