package com.zensar.training.ui;

import java.util.Arrays;

import com.zensar.training.bean.Customer;
import com.zensar.training.bean.CustomerBalanceComparator;
import com.zensar.training.bean.CustomerIdComparator;
import com.zensar.training.bean.CustomerNameComparator;

public class Main1 {

	public static void main(String[] args) {
		Customer customer=new Customer(101,"John",2000.00);
		Customer customer1=new Customer(1,"Ravi",7000.00);
		Customer customer2=new Customer(11,"Kiran",8000.00);
		Customer customer3=new Customer(21,"Abhi",20000.00);
		
		Customer []customerArr= {customer,customer1,customer2,customer3};
		
		System.out.println(Arrays.toString(customerArr));
		
		Arrays.sort(customerArr);  //sort function will use compareTo function for sorting
		
		System.out.println("**********************\n"+Arrays.toString(customerArr));
		
		CustomerIdComparator customerIdComparator=new CustomerIdComparator();
		CustomerBalanceComparator customerBalanceComparator=new CustomerBalanceComparator();
		
		Arrays.sort(customerArr,customerIdComparator);
		System.out.println("**********************\n"+Arrays.toString(customerArr));
		
		Arrays.sort(customerArr,customerBalanceComparator);
		System.out.println("**********************\n"+Arrays.toString(customerArr));
		
		CustomerNameComparator customerNameComparator=new CustomerNameComparator();
		Arrays.sort(customerArr,customerNameComparator);
		System.out.println("**********************\n"+Arrays.toString(customerArr));
	}

}
