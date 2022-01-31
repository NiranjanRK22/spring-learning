package com.greetapp.basic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    private String city;
    private String state;
    private int zip;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String state, int zip) {
		super();
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	@Value("Hyd")
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	@Value("Telangana")
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	@Value("500004")
	public void setZip(int zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	   
}
