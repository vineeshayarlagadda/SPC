package com.g3.spc.entities;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Embeddable 
public class Address {
	
	private String buildingName;
	private String streetName;
	private String cityName;
	private String pincode;
	
//	@OneToOne(mappedBy = "address")
//	private Student student;
	
	
	public Address(String buildingName, String streetName, String cityName, String pincode) {
		super();
		this.buildingName = buildingName;
		this.streetName = streetName;
		this.cityName = cityName;
		this.pincode = pincode;
	}


	public Address() {
		super();
	}


//	public Student getStudent() {
//		return student;
//	}
//
//
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}




	public String getBuildingName() {
		return buildingName;
	}


	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	@Override
	public String toString() {
		return "Address [buildingName=" + buildingName + ", streetName=" + streetName + ", cityName=" + cityName
				+ ", pincode=" + pincode + "]";
	}
	
	
	
	
}
