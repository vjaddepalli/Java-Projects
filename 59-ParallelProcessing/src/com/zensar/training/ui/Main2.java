package com.zensar.training.ui;

import java.util.List;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Student;

public class Main2 {

	public static void main(String[] args) {
		
		List<Student> students=CollectionFactory.getStudentList();
		students.stream().parallel().forEach((s)->System.out.println(s));
		

	}

}
