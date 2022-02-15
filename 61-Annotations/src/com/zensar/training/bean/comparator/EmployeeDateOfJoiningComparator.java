package com.zensar.training.bean.comparator;

import java.util.Comparator;

import com.zensar.training.annotations.Author;
import com.zensar.training.annotations.Modifiable;
import com.zensar.training.bean.Employee;

@Author(name="Vijay")
@Modifiable(value = false)
public class EmployeeDateOfJoiningComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getHiredDate().isBefore(o2.getHiredDate()))
			return -1;
		if(o1.getHiredDate().isAfter(o2.getHiredDate()))
			return 1;
		return 0;
	}

}
