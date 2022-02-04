package com.zensar.training.ui;

public class Main1 {

	public static void main(String[] args) {

		int[][] data;
		data = new int[3][2];

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + ", ");
			}
			System.out.println();
		}

		data[0][0] = 15; //first row first element
		data[0][1] = 25; //first row second element

		data[1][0] = 35; //2nd row first element
		data[1][1] = 45; //2nd row 2nd element

		data[2][0] = 55; //3rd row 1st element
		data[2][1] = 65; //3rd row  2nd element

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + ", ");
			}
			System.out.println();
		}

	}

}
