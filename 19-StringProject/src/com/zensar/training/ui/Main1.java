package com.zensar.training.ui;

public class Main1 {

	public static void main(String[] args) {
		
		String s1=new String("Hello How Are You");
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(7));
		
		System.out.println(s1.endsWith("You"));
		System.out.println(s1.startsWith("Hello"));
		
		System.out.println(s1.contains("Are"));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(7,12));
		
		System.out.println(s1.indexOf("Are"));
		System.out.println(s1.lastIndexOf("Are"));
		
		String s2=s1.toUpperCase();
		System.out.println(s2);
		String s3=s1.toLowerCase();
		System.out.println(s3);
		
		String s4=s1.replace('H', 'W');
		System.out.println(s4);
		
		System.out.println(s1);
		
		String s5=new String("Zensar");
		String s6=new String("zensar");
		System.out.println(s5.equalsIgnoreCase(s6));
		System.out.println(s1==s2);
		

	}

}
