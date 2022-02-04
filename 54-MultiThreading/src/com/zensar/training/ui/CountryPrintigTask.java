package com.zensar.training.ui;

public class CountryPrintigTask implements Runnable{

	@Override
	public void run() {
		
		String countries[]= {"India","USA","Japan","Canada"};
		for(String country:countries) {
			Thread temp=Thread.currentThread();
			System.out.println("\t\t"+temp.getName()+" : "+country);
		}
		
	}
	

}
