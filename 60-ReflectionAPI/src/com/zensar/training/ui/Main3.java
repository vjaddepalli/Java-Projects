package com.zensar.training.ui;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.zensar.training.bean.Circle;

public class Main3 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class myClass=Circle.class;
		Object obj=myClass.newInstance();
		Method method=myClass.getMethod("setRadius",int.class);
		method.invoke(obj, 10);
		Method method2=myClass.getMethod("computeArea");
		System.out.println(method2.invoke(obj));
		
		

	}

}
