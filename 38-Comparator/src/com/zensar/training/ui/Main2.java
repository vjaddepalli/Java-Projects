package com.zensar.training.ui;

import java.util.Arrays;

import com.zensar.training.bean.Customer;
import com.zensar.training.bean.StdDeptComparator;
import com.zensar.training.bean.StdMarksComparator;
import com.zensar.training.bean.StdNameComparator;
import com.zensar.training.bean.Student;
import com.zensar.training.bean.StudentRollNoComparator;

public class Main2 {

	public static void main(String[] args) {
		Student student=new Student(101, "Ram", "IT", 50);
		Student student1=new Student(11, "Charan", "COMP", 70);
		Student student2=new Student(21, "Vijay", "IT", 55);
		Student student3=new Student(55, "Mahesh", "ENTC", 100);
		
		Student []studentsArr= {student,student1,student2,student3};
		System.out.println(Arrays.toString(studentsArr)); 
		
		StudentRollNoComparator studentRollNoComparator=new StudentRollNoComparator();
		StdMarksComparator stdMarksComparator=new StdMarksComparator();
		StdNameComparator stdNameComparator=new StdNameComparator();
		StdDeptComparator stdDeptComparator=new StdDeptComparator();
		
		//sort by roll no
		Arrays.sort(studentsArr,studentRollNoComparator);
		System.out.println("<<<<<----<<<<---------<<<<>>>>------------->>>>----------->>>>>");
		System.out.println(Arrays.toString(studentsArr));
		
		//sort by marks
		Arrays.sort(studentsArr,stdMarksComparator);
		System.out.println("<<<<<----<<<<---------<<<<>>>>------------->>>>----------->>>>>");
		System.out.println(Arrays.toString(studentsArr));
		
		//sort by name
		Arrays.sort(studentsArr,stdNameComparator);
		System.out.println("<<<<<----<<<<---------<<<<>>>>------------->>>>----------->>>>>");
		System.out.println(Arrays.toString(studentsArr));
		
		//sort by dept
		Arrays.sort(studentsArr,stdDeptComparator);
		System.out.println("<<<<<----<<<<---------<<<<>>>>------------->>>>----------->>>>>");
		System.out.println(Arrays.toString(studentsArr));
		
	}

}
