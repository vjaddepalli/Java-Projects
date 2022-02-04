package com.zensar.training.ui;

import com.zensar.training.bean.Processing;

public class Main {

	public static void main(String[] args) {
		Processing<String> process=new Processing<String>();
		process.setData("Welcome");
		System.out.println(process.getData());
		
		Processing<Double> d=new Processing<Double>();
		d.setData(52.36);
		System.out.println(d.getData());
		
		Processing<Boolean> b=new Processing<Boolean>();
		b.setData(true);
		System.out.println(b.getData());
	}

}
