package com.zensar.training.ui;

public class Main8 {

	public static void main(String[] args) throws InterruptedException {
		BankAccount account=new BankAccount(6);
		DepositTask depositTask=new DepositTask(account);
		WithdrawTask withdrawTask=new WithdrawTask(account);
		
		Thread depositThread=new Thread(depositTask,"DT");
		Thread withdrawThread=new Thread(withdrawTask,"WT");
		
		depositThread.start();
		withdrawThread.start();	

	}

}
