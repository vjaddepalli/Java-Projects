package com.zensar.training.ui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main2 {

	public static void main(String[] args) throws IOException {
		
		OutputStream os;
		os=new FileOutputStream("welcome.txt");
		byte[]arr= {'A','B','C'};
		
		os.write(arr);
		os.flush();
		os.close();
	}

}
