package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.List;

public class Main4 {

	//list interface
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		
		list.add("Welocme");
		list.add("Hello");
		list.add("Zensar");
		list.add("Training");
		list.add("Welcome");
		
		//list specific methods
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		list.set(1, "Mumbai");
		System.out.println(list.indexOf("Zensar"));
		System.out.println(list.indexOf("Training"));
		list.add(2,"Chennai");
		System.out.println(list);
		
	}

}
