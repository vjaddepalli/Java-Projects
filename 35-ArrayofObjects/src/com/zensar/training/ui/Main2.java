package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Square;

public class Main2 {

	public static void main(String[] args) {
		Square[] squares = new Square[4];

		squares[0] = new Square(5);
		squares[1] = new Square(2);
		squares[2] = new Square(8);
		squares[3] = new Square(7);

		for (int i = 0; i < squares.length; i++) {
			System.out.println(squares[i].getSize() + ", " + squares[i].calculateArea());

		}

		for (Square square : squares) {
			System.out.println(square);
			System.out.println(square.getSize() + ", " + square.calculateArea());
		}

		squares = null;

	}

}
