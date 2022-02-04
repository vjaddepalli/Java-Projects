package com.zensar.training.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import com.zensar.training.bean.Student;

public class Main8 {

	public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.dat"));
		List<Student> students = (List<Student>) ois.readObject();
		System.out.println(students);
		ois.close();

	}

}
