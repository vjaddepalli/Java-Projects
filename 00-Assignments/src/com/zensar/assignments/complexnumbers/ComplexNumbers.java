package com.zensar.assignments.complexnumbers;

public class ComplexNumbers {

	private int real;
	private int imag;

	public ComplexNumbers() {
		super();
	}

	public ComplexNumbers(int real, int imag) {
		super();
		this.real = real;
		this.imag = imag;
	}

	public static void main(String[] args) {
		ComplexNumbers c1 = new ComplexNumbers();
		ComplexNumbers c2 = new ComplexNumbers();
		c1.real = 4;
		c1.imag = 7;
		c2.real = 2;
		c2.imag = 5;

		ComplexNumbers c3 = new ComplexNumbers();
		c3.add(c1, c2);
		c3.sub(c1, c2);
		c3.mul(c1, c2);
		c3.swap(c1, c2);
	}

	// Addition
	public void add(ComplexNumbers c1, ComplexNumbers c2) {
		ComplexNumbers cn = new ComplexNumbers();
		cn.real = c1.real + c2.real;
		cn.imag = c1.imag + c2.imag;
		System.out.println(cn.real + "+i" + cn.imag);

	}

	// Subtraction
	public void sub(ComplexNumbers c1, ComplexNumbers c2) {
		ComplexNumbers cn = new ComplexNumbers();
		cn.real = c1.real - c2.real;
		cn.imag = c1.imag - c2.imag;
		System.out.println(cn.real + "+i" + cn.imag);
	}

	// Multiplication
	public void mul(ComplexNumbers c1, ComplexNumbers c2) {
		ComplexNumbers cn = new ComplexNumbers();
		cn.real = c1.real * c2.real;
		cn.imag = c1.imag * c2.imag;
		System.out.println(cn.real + "+i" + cn.imag);
	}

	// Swap
	public void swap(ComplexNumbers c1, ComplexNumbers c2) {
		ComplexNumbers cn = new ComplexNumbers();

		System.out.println("Before Swap: C1=" + c1.real + "+i" + c1.imag + " and  C2=" + c2.real + "+i" + c2.imag);
		cn = c1;
		c1 = c2;
		c2 = cn;
		System.out.println("After Swap: C1=" + c1.real + "+i" + c1.imag + " and  C2=" + c2.real + "+i" + c2.imag);

	}

}
