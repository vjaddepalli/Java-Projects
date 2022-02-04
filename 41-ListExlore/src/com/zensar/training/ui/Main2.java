package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {

		Collection<Double> collection;
		collection = new ArrayList<Double>();

		collection.add(10.0);
		collection.add(22.4);
		collection.add(120.0);
		collection.add(1020.0);
		collection.add(54.15);
		System.out.println(collection);

		collection.remove(1020.0);
		System.out.println(collection);

		System.out.println(collection.size());
		System.out.println(collection.contains(120.0));
		System.out.println(collection.contains(120));
		System.out.println(collection.isEmpty());

		// collection.clear();

		Iterator<Double> it = collection.iterator();
		while (it.hasNext()) {
			Double d = it.next();
			System.out.println(d);
		}
		System.out.println("----------------------");

		for (Double d : collection) {

			System.out.println(d);
		}

	}

}
