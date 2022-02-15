package com.zensar.training.bean;

import java.util.List;

public class StringAddRunnable implements Runnable {

	List<String> list;

	public StringAddRunnable(List<String> list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		synchronized (list) {
			
			list.add("Mumbai");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list.add("Delhi");
			
		}
		
		
	}
}
