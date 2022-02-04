package com.zensar.training.bean;

import java.util.Objects;

public class Rectangle implements Comparable<Rectangle>{
	
	int height;
	int width;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public Rectangle() {
		super();
	}
	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	@Override
	public int hashCode() {
		return Objects.hash(height, width);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Rectangle))
			return false;
		Rectangle other = (Rectangle) obj;
		return height == other.height && width == other.width;
	}
	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}
	@Override
	public int compareTo(Rectangle o) {
		if(this.height<o.height)
			return -1;
		if(this.height>o.height)
			return 1;
		return 0;
	}
	
	
	
	

}
