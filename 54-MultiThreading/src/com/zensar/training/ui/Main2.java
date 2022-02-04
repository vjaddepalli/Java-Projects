package com.zensar.training.ui;

public class Main2 {

	public static void main(String[] args) {

		Thread t1 = new CityPrintingThread(); // new state
		t1.start(); // runnable state

		//jvm will continue current thread
		for (int i = 1; i <= 25; i++) {
			System.out.println(i);
		}
		
		//currently running main thread
		//after completion of for loop run child threads
		//t1 will move to running state
		//once thread finished process it will come to dead state		

	}

}
