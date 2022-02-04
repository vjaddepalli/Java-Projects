package com.zensar.training.ui;

public class Main10 {

	public static void main(String[] args) {
		RandomAccessFileTask raft= new RandomAccessFileTask();
		JDBCConnection jdbc=new JDBCConnection();
		
		Thread t1=new Thread(raft);
		Thread t2=new Thread(jdbc);
		t1.setName("RandomAccessFileThread");
		t1.start();
		t2.setName("JDBCThread");
		t2.start();

	}

}
