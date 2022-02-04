package com.zensar.training.ui;

import com.zensar.training.bean.A;
import com.zensar.training.bean.B;

public class Client1 {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.compute(10);
		
		B obj1 = new B();
		obj1.compute(10);
		
		A obj2=new B();
		obj2.compute(10);

	}

}
