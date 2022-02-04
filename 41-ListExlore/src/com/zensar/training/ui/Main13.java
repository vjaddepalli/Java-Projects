package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.List;

import com.zensar.training.bean.Circle;

public class Main13 {

	public static void main(String[] args) {
		
		List<Circle> circle=new ArrayList<>();
		circle.add(new Circle(25));
		circle.add(new Circle(35));
		circle.add(new Circle(45));
		
		for(Circle c: circle) {
			System.out.println(c.computeArea());
		}
		
		List list=new ArrayList<>();
		list.add("Zensar");
		list.add(new Integer(45));
		list.add(new Circle(4));
		
		for(Object obj: list) {
			if(obj instanceof String) {
				String str=(String) obj;
				System.out.println(str);
			}
			
			if(obj instanceof Integer) {
				Integer i=(Integer) obj;
				System.out.println(i.doubleValue());
			}
			
			if(obj instanceof Circle) {
				Circle c=(Circle) obj;
				System.out.println(c.computeArea());
			}
		}

	}

}
