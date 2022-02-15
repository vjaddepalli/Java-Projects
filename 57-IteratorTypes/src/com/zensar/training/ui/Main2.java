package com.zensar.training.ui;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main2 {

	public static void main(String[] args) {
		List<String> names=new CopyOnWriteArrayList<>(); //concurrent hashmap also fail safe iterator
		names.add("john");
		names.add("Williams");
		names.add("Jack");
		names.add("Vincy");
		
		Iterator<String> it=names.iterator(); //fail safe iterator
		while(it.hasNext()) {
			System.out.println(it.next());
			names.add("Jackson");
		}
		System.out.println(names);

	}

}
