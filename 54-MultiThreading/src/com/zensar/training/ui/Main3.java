package com.zensar.training.ui;

public class Main3 {

	public static void main(String[] args) {
		
		CountryPrintigTask countryPrintigTask=new CountryPrintigTask();
		
		Thread t1,t2;
		t2=new Thread(countryPrintigTask);
		t1=new Thread(countryPrintigTask);
		
		CityPrintingThread cpt=new CityPrintingThread();
		cpt.start();
		

	}

}
