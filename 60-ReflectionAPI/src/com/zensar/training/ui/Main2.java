package com.zensar.training.ui;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.zensar.training.bean.Student;

public class Main2 {
	
	

	public static void main(String[] args) throws ClassNotFoundException {
		//Class myClass=Class.forName("java.lang.Comparable");
		Class myClass=Student.class;
		System.out.println("------------------------------");
		System.out.println("Class name: "+myClass.getSimpleName());
		Method[] allMethods=myClass.getDeclaredMethods();
		System.out.println("------------------------------");
		for(Method m: allMethods) {
			System.out.println("method : "+m.getName());
		}
		
		Field[] allFields=myClass.getDeclaredFields();
		System.out.println("------------------------------");
		for(Field f: allFields) {
			System.out.println("Field: "+f.getName());
		}
		System.out.println("------------------------------");
		Constructor[] constructors=myClass.getConstructors();
		for(Constructor c: constructors) {
			System.out.println("Constructor: "+c);
		}
	}
}
