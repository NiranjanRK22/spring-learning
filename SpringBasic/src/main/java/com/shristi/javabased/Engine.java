package com.shristi.javabased;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    
	private String type;
	private int mileage;
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engine(String type, int mileage) {
		super();
		this.type = type;
		this.mileage = mileage;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return "Engine [type=" + type + ", mileage=" + mileage + "]";
	}
	
	
}
