package com.zensar.training.ui;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Student;

public class Main1 {
	public static void main(String[] args) {
		List<Student> students=CollectionFactory.getStudentList();
		System.out.println(students);
		
		Map<String, List<Student>> studentsByDeptMap;
		studentsByDeptMap=students.stream().collect(Collectors.groupingBy(Student::getDepartment));
		System.out.println(studentsByDeptMap);
		
		Map<Gender, List<Student>> studentsByGenderMap;
		studentsByGenderMap=students.stream().collect(Collectors.groupingBy(Student::getGender));
		System.out.println(studentsByGenderMap);
		
		Map<Boolean, List<Student>> partition;
		partition=students.stream().collect(Collectors.partitioningBy(s->s.getAverageMark()>80));
		System.out.println(partition);

	}
}
