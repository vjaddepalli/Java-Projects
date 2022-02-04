package com.zensar.training.bean;

import java.util.Comparator;

public class StdNameComparator  implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
