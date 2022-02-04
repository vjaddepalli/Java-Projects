package com.zensar.training.ui;

public class DepositTask implements Runnable{

	BankAccount account;
	
	
	
	public DepositTask(BankAccount account) {
		super();
		this.account = account;
	}



	@Override
	public void run() {
		account.deposit(30.0);
	}

}
