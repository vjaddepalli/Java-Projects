package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.zensar.training.bean.LengthCountRunnable;
import com.zensar.training.bean.StringAddRunnable;

public class Main1 {

	public static void main(String[] args) throws InterruptedException {
		List<String> myList = new ArrayList<>();
		myList.add("Zensar");
		myList.add("Training");
		
		List<String> syncList= Collections.synchronizedList(myList);

		StringAddRunnable adderRunnable = new StringAddRunnable(syncList);
		LengthCountRunnable countingRunnable = new LengthCountRunnable(syncList);

		Thread t1 = new Thread(adderRunnable);
		Thread t2 = new Thread(countingRunnable);
		

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(myList);
		System.out.println(countingRunnable.sum);

	}

}
