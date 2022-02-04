package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.CircleStackImpl;
import com.zensar.training.bean.Square;
import com.zensar.training.bean.SquareStackImpl;

public class Main5 {

	public static void main(String[] args) {
		Square s1,s2,s3,s4;
		s1=new Square(6);
		s2=new Square(7);
		s3=new Square(8);
		s4=new Square(9);
		
		SquareStackImpl impl = new SquareStackImpl(10);
		impl.push(s1);
		impl.push(s2);
		impl.push(s3);
		impl.push(new Square(25));
		impl.push(new Square(20));
		
		System.out.println(impl);
		System.out.println(impl.pop());
		System.out.println(impl);

	}

}
