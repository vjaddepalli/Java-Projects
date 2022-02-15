package com.zensar.training.ui;

import java.util.Collections;
import java.util.List;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.CollectionFactory;

public class Main1 {
	public static void main(String[] args) {
		
		List<Circle> allCircles=CollectionFactory.getCircleList();
		allCircles.stream().parallel().forEach((c)->System.out.println(c));
		
	}
}
