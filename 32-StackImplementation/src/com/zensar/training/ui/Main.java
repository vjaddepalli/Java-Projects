package com.zensar.training.ui;

import com.zensar.training.bean.IntStack;

public class Main {

	public static void main(String[] args) {
		
		IntStack inStack = new IntStack(10);
		inStack.push(15);
		inStack.push(18);
		inStack.push(22);
		inStack.push(16);
		inStack.push(20);
		
		System.out.println(inStack.toString());
		System.out.println(inStack.pop());
		
		System.out.println(inStack.pop());
		System.out.println(inStack.pop());
		System.out.println(inStack.pop());

	}

}
