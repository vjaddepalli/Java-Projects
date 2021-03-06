package com.zensar.training.ui;

public class BankAccount {

	private double balance;
	boolean maxReached;
	boolean minReached;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	public synchronized void withDraw(double amt) {
		for (int i = 1; i <= amt; i++) {
			if (this.balance <= 5) {
				minReached = true;
				try {
					notify(); //send notification to wait state threads
					wait(); //will go to wait state, signal to jvm thread schedular release the lock
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			this.balance = this.balance - 1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.print(Thread.currentThread().getName() + " : ");
			System.out.println("Amount Withdrawn " + i + "  Balance: " + this.balance);

		}
		notify(); // call to wait state thread
	}

	public synchronized void deposit(double amt) {

		for (int i = 1; i <= amt; i++) {
			if (this.balance >= 25) {
				maxReached = true;
				try {
					notify();
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			this.balance = this.balance + 1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.print(Thread.currentThread().getName() + " : ");
			System.out.println("Amount Deposited " + i + "  Balance: " + this.balance);
		}
		notify();

	}

}
