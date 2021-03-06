package com.zensar.training.ui;

import java.util.Collections;
import java.util.List;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.comparator.EmployeeNameComparator;
import com.zensar.training.bean.comparator.EmployeeSalaryComparator;

public class Main2 {

	public static void main(String[] args) {
		
		List<Employee> allEmployees=CollectionFactory.getEmployeeList();
		System.out.println(allEmployees);
		
		Collections.sort(allEmployees);
		System.out.println(allEmployees);
		System.out.println("----------------------------------------");
		System.out.println(Collections.binarySearch(allEmployees, new Employee(5004)));
		System.out.println(Collections.min(allEmployees));
		System.out.println(Collections.max(allEmployees));
		
		System.out.println("----------------------------------------");
		EmployeeNameComparator enc=new EmployeeNameComparator();
		Collections.sort(allEmployees,enc);
		System.out.println(allEmployees);
		
		System.out.println(Collections.binarySearch(allEmployees, new Employee(5003)));
		//System.out.println(Collections.binarySearch(allEmployees, enc));
		System.out.println(Collections.min(allEmployees, enc));
		System.out.println(Collections.max(allEmployees, enc));
		
		System.out.println(Collections.max(allEmployees, new EmployeeSalaryComparator()));
		

	}

}
