package com.zensar.training.ui;

import java.util.function.Predicate;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

public class Main3 {
	
	static void demo(Predicate<Square> predicate, Square s) {
		
		System.out.println(predicate.test(s));
	}
	
	static void demo2(Predicate<Square> predicate, Square s) {
		System.out.println(predicate.test(s));
	}
	
	static void demo3(Predicate<Student> predicate, Student s) {
		System.out.println(predicate.test(s));
	}
	static void demo4(Predicate<Student> predicate, Student s) {
		System.out.println(predicate.test(s));
	}


	public static void main(String[] args) {
		//predicate 
		
		Predicate<Circle> predicate1;
		predicate1=(Circle c)->c.getRadius()>100?true:false;
		System.out.println(predicate1.test(new Circle(25)));
		
		Predicate<String> predicate2;
		predicate2=(s)->s.length()>10?true:false;
		System.out.println(predicate2.test("zensar technologies"));
		
		
		demo((s)->s.getSize()>5?true:false, new Square(10));
		demo2((s)->s.calculateArea()>100?true:false,new Square(11));
		demo3((s)->s.getAverageMark()>60?true:false,new Student(101, "Vijay", Gender.MALE, 75.0, "CSE"));
		demo4((s)->s.getGender().equals(Gender.MALE)?true:false,new Student(101, "Anusha", Gender.FEMALE, 75.0, "CSE"));

	}

}
