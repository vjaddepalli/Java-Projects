package com.zensar.training.ui;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Student;

public class Main1 {
	
	static void receive(Object obj) {
		Class objectsClass=obj.getClass();
		System.out.println("------------------------------");
		System.out.println("Class name: "+objectsClass.getSimpleName());
		Method[] allMethods=objectsClass.getDeclaredMethods();
		System.out.println("------------------------------");
		for(Method m: allMethods) {
			System.out.println("method : "+m.getName());
		}
		
		Field[] allFields=objectsClass.getDeclaredFields();
		System.out.println("------------------------------");
		for(Field f: allFields) {
			System.out.println("Field: "+f.getName());
		}
		System.out.println("------------------------------");
		Constructor[] constructors=objectsClass.getConstructors();
		for(Constructor c: constructors) {
			System.out.println("Constructor: "+c);
		}
	}
	
	public static void main(String[] args) {
		Circle circle=new Circle(10);
		Student student=new Student();
		Employee employee=new Employee();
		//receive(circle);
		//receive(employee);
		receive(student);
		
	}
}
