package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("john");
		names.add("Williams");
		names.add("Jack");
		names.add("Vincy");

		Iterator<String> it = names.iterator(); //fail fast iterator ex: Arraylist and hashmap

		while (it.hasNext()) {
			String str=it.next();
			//names.remove("Jack"); //exception occcured
			//name.add("meena");
			//does not allowed structural changes when assigned to iterator
			names.set(1, "Jackson");
		}
		System.out.println(names);

	}

}
