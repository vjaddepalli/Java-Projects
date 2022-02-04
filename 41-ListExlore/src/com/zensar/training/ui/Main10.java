package com.zensar.training.ui;

import java.util.Set;
import java.util.TreeSet;

import com.zensar.training.bean.Rectangle;

public class Main10 {

	public static void main(String[] args) {
		Set<Rectangle> r=new TreeSet<Rectangle>();
		
		Rectangle r1=new Rectangle(5, 2);
		Rectangle r2=new Rectangle(3, 2);
		
		r.add(r1);
		r.add(r2);
		
		System.out.println(r);

	}

}
