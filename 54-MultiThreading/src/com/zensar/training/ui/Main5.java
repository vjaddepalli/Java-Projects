package com.zensar.training.ui;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		
		
		
		Runnable countryPrintingRunnable;
		countryPrintingRunnable = () -> {
			String countries[] = { "India", "USA", "Japan", "Canada" };
			for (String country : countries) {
				Thread temp = Thread.currentThread();
				System.out.println("\t\t" + temp.getName() + " : " + country);
			}
		};

		Thread t1 = new Thread(countryPrintingRunnable);
		t1.start();
		
		int age;
		System.out.println("Enter your age: ");
		Scanner scan=new Scanner(System.in);
		age=scan.nextInt();
		System.out.println(age);

	}

}
