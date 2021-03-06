package com.zensar.training.ui;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Employee;

public class Main8 {

	public static void main(String[] args) throws IOException {
		// employee data file
		// refer main6
		List<Employee> employees = CollectionFactory.getEmployeeList();
		RandomAccessFile accessFile = new RandomAccessFile("employees.dat", "rw");

		for (Employee employee : employees) {
			accessFile.writeInt(employee.getId());
			accessFile.writeUTF(employee.getName());
			accessFile.writeChar(employee.getGrade());
			accessFile.writeUTF(employee.getHiredDate().toString());
			accessFile.writeDouble(employee.getBasicSalary());
			accessFile.writeUTF(employee.getGender().toString());
		}
		accessFile.close();
	}
}
