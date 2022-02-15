package com.zensar.training.bean;

import com.zensar.training.annotations.Model;
import com.zensar.training.annotations.TestDoubles;
import com.zensar.training.annotations.TestIntegers;

public class Atest {
	
	@TestIntegers(ints= {3,4,5,6,7})
	void test1() {
		
	}
	
	@TestDoubles(doubles = {2.3,5.6,8.3})
	void test2() {
		
	}
	
	void m2(@Model double d) {
		
	}

}
