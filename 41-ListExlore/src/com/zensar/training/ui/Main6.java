package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.zensar.training.bean.Square;

public class Main6 {

	//list and ArrayList
	public static void main(String[] args) {
		List<Square> allSquares = new LinkedList<>();

		Square s1 = new Square(5);
		Square s2 = new Square(2);
		Square s3 = new Square(8);
		Square s4 = new Square(3);
		Square s5 = new Square(9);

		allSquares.add(s1);
		allSquares.add(s2);
		allSquares.add(s3);
		allSquares.add(s4);
		allSquares.add(s5);

		//System.out.println(allSquares.get(2));
		//System.out.println(allSquares.get(allSquares.size()-1));
		System.out.println(allSquares);
		
		//adding element at specified position
		allSquares.add(3, new Square(100));
		System.out.println(allSquares);
		
		//replacing elements at specific position
		allSquares.set(0, new Square(200));
		System.out.println(allSquares);
		
		//indexOf method
		System.out.println(allSquares.indexOf(new Square(1000)));
		
		//contains method
		System.out.println(allSquares.contains(new Square(9)));
		
		System.out.println("<<<--------------------------->>>");
		for(Square square: allSquares) {
			System.out.println(square.calculateArea());
		}
		allSquares.clear();
	}

}
