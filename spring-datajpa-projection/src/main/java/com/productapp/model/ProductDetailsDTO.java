package com.productapp.model;

//DTO projection using class
public class ProductDetailsDTO {
    
	String productName;
	double price;
	
	public ProductDetailsDTO(String productName, double price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	
	public String getProductName() {
		return productName;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	
	@Override
	public String toString() {
		return "ProductDetailsDTO [productName=" + productName + ", price=" + price + "]";
	}
	
	
}
