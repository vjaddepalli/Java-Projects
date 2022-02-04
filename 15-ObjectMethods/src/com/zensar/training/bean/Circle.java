package com.zensar.training.bean;

public class Circle {

	int radius;

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

	
	 @Override public boolean equals(Object obj) { 
		 if(!(obj instanceof Circle))
				return false;
			if(obj==null)
				return false;
		 Circle temp=(Circle) obj;
		 if(temp.radius==this.radius)
			 return true;
		 return false;
	 }

}
