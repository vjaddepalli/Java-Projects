package com.zensar.assignments.account;

public class Account {

	public static void main(String[] args) {
		
		Account a =new Account();
		a.deposit();
		a.withdraw();
		a.printBalance();
		

	}
	
	public void deposit() {
		System.out.println("Money Deposited");
	}
	
	public void withdraw() {
		System.out.println("Withdrawn Success");
	}
	
	public void printBalance() {
		System.out.println("Avilable Balance");
	}

}
