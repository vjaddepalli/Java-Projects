package com.zensar.training.ui;

public class ReverseNumberPrintingThread extends Thread{
	
	@Override
	public void run() {
		
		Thread t=Thread.currentThread();
		for(int i=1000;i>=1;i--) {
			
			System.out.println("\t "+t.getName()+" : "+i);
			
		}
		
	}

}
