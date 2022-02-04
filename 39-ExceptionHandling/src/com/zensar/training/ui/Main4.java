package com.zensar.training.ui;

import com.zensar.training.bean.Customer;

public class Main4 {

	public static void main(String[] args)  {
		
		Customer c1=null;
		try {
			c1 = new Customer(101, "John", -1000);
			System.out.println(c1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(c1);	
	}

}
