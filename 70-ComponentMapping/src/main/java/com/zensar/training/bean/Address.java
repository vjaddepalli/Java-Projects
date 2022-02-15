package com.zensar.training.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	@Column(name = "e_doorno")
	private String doorNumber;

	@Column(name = "e_areaname")
	private String areaName;

	@Column(name = "e_city")
	private String cityName;

	public Address(String doorNumber, String areaName, String cityName) {
		super();
		this.doorNumber = doorNumber;
		this.areaName = areaName;
		this.cityName = cityName;
	}

	public Address() {
		super();
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [doorNumber=" + doorNumber + ", areaName=" + areaName + ", cityName=" + cityName + "]";
	}

}
