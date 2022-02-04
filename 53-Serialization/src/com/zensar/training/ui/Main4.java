package com.zensar.training.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import com.zensar.training.bean.Employee;

public class Main4 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		InputStream is=new FileInputStream("employees.dat");
		ObjectInputStream ois=new ObjectInputStream(is);
		Employee emp=null;
		
		emp=(Employee) ois.readObject();
		System.out.println(emp);
		ois.close();
		is.close();

	}

}
