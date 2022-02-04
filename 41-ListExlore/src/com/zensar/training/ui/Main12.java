package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.zensar.training.bean.Customer;

public class Main12 {

	public static void main(String[] args) {
		Double obj1=new Double(99.0);
		Double obj2=new Double(40.0);
		Double obj3=new Double(68.71);
		
		Map<String, Double> results=new HashMap<>();
		results.put("maximum",obj1 );
		results.put("minimum",obj2 );
		results.put("average",obj3 );
		
		System.out.println(results);
		
		Set<String> keys=results.keySet();
		
		for(String key: keys) {
			System.out.println(key+": "+results.get(key));
		}
		
		System.out.println("<<<<<<<<--------------->>>>>>>>");
		
		Customer c1=new Customer(1011,"Ravi", 1500.00);
		Customer c2=new Customer(1012,"Vijay", 500.00);
		Customer c3=new Customer(1013,"Ram", 3500.00);
		Customer c4=new Customer(1014,"Bhim", 2500.00);
		Customer c5=new Customer(1015,"Raj", 4500.00);
		Customer c6=new Customer(1016,"Vinay", 5500.00);
		
		List<Customer> bangaloreCustomers=new ArrayList<>();
		bangaloreCustomers.add(c1);
		bangaloreCustomers.add(c2);
		
		List<Customer> mumbaiCustomers=new ArrayList<>();
		mumbaiCustomers.add(c3);
		mumbaiCustomers.add(c4);
		mumbaiCustomers.add(c5);
		mumbaiCustomers.add(c6);
		
		Map<String, List<Customer>> cityMap=new TreeMap<>();
		cityMap.put("Bangalore",bangaloreCustomers);
		cityMap.put("Mumbai", mumbaiCustomers);
		
		System.out.println(cityMap);
		
		System.out.println(cityMap.get("Bangalore"));
		System.out.println(cityMap.get("Mumbai").size());
		
		Set<String> citykeys=cityMap.keySet();
		
		Iterator<Customer> it=mumbaiCustomers.iterator();
		
		double sum=0;
		while(it.hasNext()) {
			sum=sum+it.next().getBalance();
		}
		System.out.println("Sum of mumabai custommers balance: "+sum);
		
		
		
		
		

	}

}
