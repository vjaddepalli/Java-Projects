package com.zensar.training.bean;

public class SquareStackImpl {
	
	private Square[] array;
	private int currentIndex=0;
	
	public SquareStackImpl(int n) {
		this.array = new Square[n];
	}
	
	public void push(Square n) {
		this.array[currentIndex]=n;
		currentIndex++;
	}
	
	public Square pop() {
		currentIndex--;
		return this.array[currentIndex];
	}
	
	@Override
	public String toString() {
		String str="[";
		for(int i=0;i<currentIndex;i++)
			str=str+this.array[i]+" ,";
		str=str+"]";
		
		return str;
	}

}
