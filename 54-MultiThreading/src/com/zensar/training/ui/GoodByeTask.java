package com.zensar.training.ui;

public class GoodByeTask implements Runnable{

	@Override
	public void run() {

		for(int i=0;i<=10;i++) {
			System.out.println("Good Bye");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
