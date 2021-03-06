package com.zensar.training.ui;

public class Main1 {
	public static void main(String[] args) throws InterruptedException {
		//Thread t=new Thread(); // one way of intialization
		
		//thread
		Thread t=Thread.currentThread(); //current thread reference creation
		
		//thread1
		Thread t1=new CityPrintingThread(); //creating object for cityprintingthread
		t1.setName("City Printing Thread");
		t1.start(); //when call start method then run method will be execute which is present in cityprintingthread
		
		//thread2
		CountryPrintigTask countryPrintingTask=new CountryPrintigTask();
		Thread t2=new Thread(countryPrintingTask);
		t2.setName("Country Printing Thread");
		t2.start();
		
		//thread3
		Thread t3=new ReverseNumberPrintingThread();
		t3.setName("ReverseNumberPT");
		t3.start();
		
		//thread4
		RangedNumberSumTask rnst=new RangedNumberSumTask(15, 35);
		Thread t4=new Thread(rnst);
		t4.setName("RangedNumberSumTask");
		t4.start();
		
		//thread5
		Thread t5=new CircleProcessingThread();
		t5.setName("Circle Processing Thread");
		t5.start();
		
		System.out.println("Program Begins");
		for(int i=1;i<=10;i++) {
			//getting thread name by use getName()
			System.out.println(t.getName()+" : "+i);
			t.sleep(5000); //after XXXms thread will sleep, so delayed every iteration
		}
		System.out.println("Program Ends");

	}
}
