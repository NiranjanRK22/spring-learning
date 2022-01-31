package com.shristi.basic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    private String state;
    private String city;
    private int zipCode;
	public Address() {
		super();
		System.out.println("in const address");
		
	}
	public Address(String state, String city, int zipCode) {
		super();
		this.state = state;
		this.city = city;
		this.zipCode = zipCode;
	}
	public String getState() {
		return state;
	}
	@Value("telangana")
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	@Value("hyd")
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipCode() {
		return zipCode;
	}
	@Value("50004")
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", zipCode=" + zipCode + "]";
	}
    
    
}
