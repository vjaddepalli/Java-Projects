package com.zensar.training.bean;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
