package com.zensar.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Shape;
import com.zensar.training.bean.Square;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Shape shape=null;
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		shape=(Shape) context.getBean("shapeBean");
		System.out.println(shape.computeArea());
	}
}
