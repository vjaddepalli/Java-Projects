package com.zensar.training.bean;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {
	int id;
	String name;
	double balance;

	public Customer(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public int compareTo(Customer o) {
		if(this.balance<o.balance)
			return -1;
		else if(this.balance>o.balance)
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		return "\n Customer [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
