package com.zensar.training.bean;

import java.util.Comparator;

public class CustomerBalanceComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.balance<o2.balance)
			return -1;
		else if(o1.balance>o2.balance)
			return 1;
		return 0;
	}

}
