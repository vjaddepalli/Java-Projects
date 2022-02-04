package com.zensar.training.ui;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.zensar.training.bean.Customer;
import com.zensar.training.bean.CustomerIdComparator;
import com.zensar.training.bean.CustomerNameComparator;

public class Main9 {

	CustomerIdComparator customerIdComparator = new CustomerIdComparator();
	public static void main(String[] args) {
		Set<Customer> customers=new HashSet<>();
		//Set<Customer> customers=new TreeSet<>();
		
		Customer c1=new Customer(1011,"Ravi", 1500.00);
		Customer c2=new Customer(1012,"Vijay", 500.00);
		Customer c3=new Customer(1013,"Ram", 3500.00);
		Customer c4=new Customer(1014,"Bhim", 2500.00);
		Customer c5=new Customer();
		c5.setId(1014);
		
		System.out.println(customers.add(c1));
		System.out.println(customers.add(c2));
		System.out.println(customers.add(c3));
		System.out.println(customers.add(c4));
		//System.out.println(customers.add(c5));
		
		System.out.println(customers);

	}

}
