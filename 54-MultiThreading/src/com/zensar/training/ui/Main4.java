package com.zensar.training.ui;

public class Main4 {

	public static void main(String[] args) throws InterruptedException {

		//implement Runnable using lamda expression
		Runnable countryPrintingRunnable;
		countryPrintingRunnable = () -> {
			String countries[] = { "India", "USA", "Japan", "Canada" };
			for (String country : countries) {
				Thread temp = Thread.currentThread();
				System.out.println("\t\t" + temp.getName() + " : " + country);
			}
		};

		Thread t1 = new Thread(countryPrintingRunnable);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		
		//lamda expression passesd as parameter
		Thread t2 = new Thread(() -> {
			String countries[] = { "India", "USA", "Japan", "Canada" };
			for (String country : countries) {
				Thread temp = Thread.currentThread();
				System.out.println("\t\t" + temp.getName() + " : " + country);
			}

		});
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		
	}
}
