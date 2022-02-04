package com.zensar.training.bean;

import java.util.Arrays;

public class NumberProcessing {

	private int[] array;
	private int currentIndex = 0;

	public NumberProcessing(int n) {
		array = new int[n]; // array intialization
	}

	public void add(int numberdata) {
		this.array[this.currentIndex] = numberdata;
		this.currentIndex++;
	}

	public int getMaximux() {
		int max = array[0];
		for (int num : array) {

			if (max < num)
				max = num;
		}
		return max;
	}

	public int getMinimum() {
		int min = array[0];
		for (int num : array) {

			if (num <= min)
				min = num;
		}
		return min;
	}

	public int getSum() {

		int sum = 0;
		for (int num : array) {
			sum = sum + num;
		}
		return sum;
	}

	@Override
	public String toString() {
		return Arrays.toString(this.array); // which will returned the concat data
	}

}
