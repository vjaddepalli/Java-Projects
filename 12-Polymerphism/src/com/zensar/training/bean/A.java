package com.zensar.training.bean;

public class A {
	
	public void m1(double a) {
		System.out.println("A class m1 with 1 parameter " + a);
	}
	public void m1(int a) {
		System.out.println("A class m1 with 1 parameter " + a);
	}

	public void m1(int a, int b) {

		System.out.println("A class m1 with 2 parameters " + a + " , " + b);
	}

	public void m1(byte a) {
		System.out.println("A class m1 with 1 byte parameter " + a);
	}

	public void m1(float f, boolean b) {

	}

	public void m1(boolean b, float f) {

	}

}
