package com.productapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Product {
	@Id
	@Column(name="productid")
	@GeneratedValue(generator="product_seq", strategy=GenerationType.AUTO) 
    @SequenceGenerator(name="product_seq", sequenceName="product_seq", initialValue=1, allocationSize=1)
    private Integer productId;
	@Column(name="productname", length=20)
    private String productName;
    private double price;
    @Column(length=20)
    private String brand;
    @Column(length=20)
    private String category;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, double price, String brand, String category) {
		super();
		this.productName = productName;
		this.price = price;
		this.brand = brand;
		this.category = category;
	}
	/**
	 * @return the productId
	 */
	public Integer getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", brand="
				+ brand + ", category=" + category + "]";
	}
    
    
}
