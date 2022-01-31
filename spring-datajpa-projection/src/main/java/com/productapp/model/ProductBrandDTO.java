package com.productapp.model;
//closed projections
//projection class
//should have getter methods with the same instance variable in your domain model
//should have parameterized constructor
//should hav tostring

public class ProductBrandDTO {
	private String brand;
	private String category;


	public ProductBrandDTO(String brand, String category) {
		super();
		this.brand = brand;
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public String getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "ProjectDetailsDTO [brand=" + brand + ", category=" + category + "]";
	}

}
