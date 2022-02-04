package com.zensar.training.bean;

public class Square implements Shape{
	
	private int size;

	public Square() {
		super();
	}
	
	

	public Square(int size) {
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Square [size=" + size + "]";
	}
	
	public int computeArea() {
		return this.size*this.size;
	}

	@Override
	public double getArea() {
		
		return this.computeArea();
	}
	

}
