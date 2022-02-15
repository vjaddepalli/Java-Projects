package com.zensar.training.bean;

public class Circle implements Shape{
	int radius;

	public Circle() {
		super();
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	public double calculateArea() {
		return this.radius*this.radius*3.14;
	}

	public void setSize(int size) {
		 this.setRadius(size);
		
	}

	public double computeArea() {
		
		return this.calculateArea();
	}

}
