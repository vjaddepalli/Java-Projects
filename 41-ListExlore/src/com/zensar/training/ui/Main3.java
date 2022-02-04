package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.zensar.training.bean.Circle;

public class Main3 {

	public static void main(String[] args) {
		Collection<Circle> collection;
		collection = new ArrayList<>();

		Circle c1 = new Circle(14);
		Circle c2 = new Circle(14);
		Circle c3 = new Circle(14);
		Circle c4 = new Circle(14);

		collection.add(c1);
		collection.add(c2);
		collection.add(c3);
		collection.add(new Circle(18));
		collection.add(new Circle(16));

		System.out.println(collection);
		System.out.println(collection.size());
		System.out.println(collection.contains(new Circle(15)));
		// collection.clear();
		System.out.println(collection.isEmpty());

		Iterator<Circle> it = collection.iterator();
		while (it.hasNext()) {
			Circle c = it.next();
			System.out.println(c);
		}
		System.out.println("-------------------------");
		for (Circle circle : collection) {
			System.out.println(circle);
		}

	}

}
