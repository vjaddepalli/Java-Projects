package com.zensar.training.ui;

public class CityPrintingThread extends Thread {

	// extends thread class and override run() method

	@Override
	public void run() {
		String[] cityNames = { "Mumbai", "Delhi", "kolkata" };
		for (String city : cityNames) {

			Thread temp = Thread.currentThread();
			System.out.println("\t" + temp.getName() + " : " + city);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
