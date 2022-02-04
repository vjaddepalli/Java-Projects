package com.zensar.training.bean;

public class Analyzer<A,B>{

	Object obj1;
	Object obj2;

	public void setData1(Object obj) {
		this.obj1 = obj;
	}

	public void setData2(Object obj) {
		this.obj2 = obj;
	}

	public Object getDat1() {
		return this.obj1;
	}

	public Object getData2() {
		return this.obj2;
	}

}
