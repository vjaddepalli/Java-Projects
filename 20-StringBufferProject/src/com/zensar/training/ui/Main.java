package com.zensar.training.ui;

public class Main {
	
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer();
		
		s1.append(true);
		s1.append("xyz");
		
		s1.delete(3, 5);
		s1.deleteCharAt(1);
		
		s1.insert(4, " apple ");
		
		System.out.println(s1);
		
		StringBuffer s2=new StringBuffer("Zensar");
		System.out.println(s1.equals(s2));
		
		String s3="Zensar";
		System.out.println(s2.equals(s3));
		
		s2.reverse();
		System.out.println(s2);
		
		String str=s1.toString();
		System.out.println(str);
	}

}
