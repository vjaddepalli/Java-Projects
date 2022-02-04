package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

public class Main7 {

	//List and LinkedList
	public static void main(String[] args) {
		List<Student> students = new LinkedList<>();

		Student s1=new Student(101, "Vijay", "CSE", 89);
		Student s2=new Student(102, "Aditya", "EEE", 79);
		Student s3=new Student(103, "Sohel", "ECE", 69);
		Student s4=new Student(104, "Deepak", "IT", 99);
		Student s5=new Student(105, "Mahesh", "CSE", 59);

		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);

		//System.out.println(allSquares.get(2));
		//System.out.println(allSquares.get(allSquares.size()-1));
		System.out.println(students);
		
		//adding element at specified position
		students.add(3, new Student(106, "Raj", "MECH", 49));
		System.out.println(students);
		
		//replacing elements at specific position
		students.set(0, new Student(100, "Charan", "CSE", 69));
		System.out.println(students);
		
		//indexOf method
		System.out.println(students.indexOf( new Student(99)));
		
		Student temp=new Student(100,"Lalit","Bio",70);
		//contains method
		System.out.println(students.contains( temp));
		
		System.out.println("<<<--------------------------->>>");
		for(Student student: students) {
			System.out.println(student);
		}
		students.clear();

	}

}
