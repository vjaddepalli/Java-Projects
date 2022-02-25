package com.zensar.training.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Address {

	String doorNo;
	String areaName;
	String city;

	public Address() {
		super();
	}

	public Address(String doorNo, String areaName, String city) {
		super();
		this.doorNo = doorNo;
		this.areaName = areaName;
		this.city = city;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", areaName=" + areaName + ", city=" + city + "]";
	}
	
	@PostConstruct
	public void doInit() {
		System.out.println("Address is created and wil be intialize");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Address to be removed");
	}

}
