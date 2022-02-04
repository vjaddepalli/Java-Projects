package com.zensar.training.ui;

import com.zensar.training.bean.Analyzer;

public class Main2 {

	public static void main(String[] args) {
		Analyzer<Integer, String> anz=new Analyzer<Integer, String>();
		anz.setData1(100);
		anz.setData2("Welcome");
		
		Analyzer<String, Double> anz2=new Analyzer<String, Double>();
		anz2.setData1("Welocome");
		anz2.setData2(25.36);

	}

}
