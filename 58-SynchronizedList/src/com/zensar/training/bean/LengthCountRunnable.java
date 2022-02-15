package com.zensar.training.bean;

import java.util.Iterator;
import java.util.List;

public class LengthCountRunnable implements Runnable {

	List<String> list;
	public int sum = 0;

	public LengthCountRunnable(List<String> list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {

		synchronized (list) {
			Iterator<String> it = list.iterator();

			while (it.hasNext()) {
				String str = it.next();
				sum = sum + str.length();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}

			}

		}

		// System.out.println("The Length Sum is: "+sum);
	}

}
