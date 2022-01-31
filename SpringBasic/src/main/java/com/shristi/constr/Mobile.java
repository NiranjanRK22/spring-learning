package com.shristi.constr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	private String brand;
	private String model;
	private double price;
	
	private Features features;

	public Mobile(Features features) {
		super();
		this.features = features;
	}

	public String getBrand() {
		return brand;
	}

	@Value("samsung")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	@Value("s9")
	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	@Value("32000.0")
	public void setPrice(double price) {
		this.price = price;
	}

	public Features getFeatures() {
		return features;
	}

	public void setFeatures(Features features) {
		this.features = features;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + ", price=" + price + ", features=" + features + "]";
	}

}
