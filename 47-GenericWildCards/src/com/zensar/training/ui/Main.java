package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.zensar.training.bean.CarLoan;
import com.zensar.training.bean.CollegeEducationLoan;
import com.zensar.training.bean.EducationLoan;
import com.zensar.training.bean.Loan;

public class Main {

	static void print1(List<? extends Loan> list) {
		System.out.println(list);
	}
	
	static void print2(List<? super EducationLoan> list) {
		System.out.println(list);
	}
	
	static void print3(List<?> list) {
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		
		List<Loan> loanlist1=new ArrayList<>();
		print1(loanlist1);
		print2(loanlist1);
		print3(loanlist1);
		
		List<CarLoan> loanlist2=new ArrayList<>();
		print1(loanlist2);
		//print2(loanlist2); //error not super class of Education Loan
		print3(loanlist2);
		
		List<EducationLoan> loanlist3=new ArrayList<>();
		print1(loanlist3);
		print2(loanlist3);
		print3(loanlist3);
		
		List<CollegeEducationLoan> loanlist4=new LinkedList<>();
		print1(loanlist4);
		//print2(loanlist4); //error not super class of Education Loan
		print3(loanlist4);
		
		List<Integer> list5=new ArrayList<>();
		//print1(list5); //error
		//print2(list5);
		print3(list5);
		
		List<Object> list6=new ArrayList<>();
		print2(list6);
		//print1(loanlist1);
		print3(list6); 
		
	}

}
