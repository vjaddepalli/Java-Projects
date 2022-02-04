package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Student;

public class Test1 {
	
	public static void test(Object obj) {
		
	}

	public static void main(String[] args) {
		Object obj=new Circle();
		
		test(new Circle());
		test(new Student());
	}

}
