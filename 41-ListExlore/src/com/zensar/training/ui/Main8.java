package com.zensar.training.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main8 {

	//set and hashset
	public static void main(String[] args) {
		Set<String> myset=new LinkedHashSet<>();
		
		myset.add("Welcome");
		myset.add("Zensar");
		myset.add("Training");
		myset.add("Mumbai");
		myset.add("Welcome");
		
		System.out.println(myset);
		System.out.println(myset.size());
		System.out.println(myset.contains("Welcome"));
		System.out.println(myset.isEmpty());
		//myset.clear();
		System.out.println(myset.isEmpty());
		
		Iterator<String> it=myset.iterator();
		while(it.hasNext()) {
			String str=it.next();
			System.out.println(str.toUpperCase());
		}
		System.out.println("-------------------");
		for(String str: myset) {
			System.out.println(str.toLowerCase());
		}

	}

}
