package com.zensar.training.ui;

import com.zensar.training.bean.NumberProcessing;

public class Main {

	public static void main(String[] args) {

		NumberProcessing processing;
		processing = new NumberProcessing(10);
		System.out.println(processing.toString());

		processing.add(34);
		processing.add(18);
		processing.add(22);
		processing.add(16);
		processing.add(19);
		processing.add(32);
		processing.add(17);
		processing.add(23);
		processing.add(11);
		processing.add(12);

		System.out.println(processing.toString());
		System.out.println(processing.getMaximux());
		System.out.println(processing.getMinimum());
		System.out.println(processing.getSum());

	}

}
