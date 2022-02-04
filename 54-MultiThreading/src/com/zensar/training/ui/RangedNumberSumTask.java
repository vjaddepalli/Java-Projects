package com.zensar.training.ui;

public class RangedNumberSumTask implements Runnable{

	int start;
	int end;
	
	
	
	public RangedNumberSumTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}



	@Override
	public void run() {
		Thread t=Thread.currentThread();
		int sum=0;
		if(start<end) {
			
			for(int i=start;i<=end;i++) {
				sum=sum+i;
			}
			System.out.println("\t"+t.getName()+" : "+sum);
		}
		
			
		
	}

}
