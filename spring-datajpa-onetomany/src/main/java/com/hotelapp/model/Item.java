package com.hotelapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Item {
	@Id
    @Column(name="itemid")
    @GeneratedValue(generator="item_seq", strategy=GenerationType.AUTO) 
    @SequenceGenerator(name="item_seq", sequenceName="item_sequence", initialValue=1, allocationSize=1)
	private Integer itemId;
	@Column(name="itemname", length=20)
	private String itemName;
	@Column(length=20)
	@Enumerated(EnumType.STRING)
	private Category category;
	@Column(length=20)
	private String cuisine;
	@Column(name="itemtype", length=20)
	@Enumerated(EnumType.STRING)
	private Type itemType;
	private double price;
	/**
	 * 
	 */
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param itemName
	 * @param category
	 * @param cuisine
	 * @param itemType
	 * @param price
	 */
	public Item(String itemName, Category category, String cuisine, Type itemType, double price) {
		super();
		this.itemName = itemName;
		this.category = category;
		this.cuisine = cuisine;
		this.itemType = itemType;
		this.price = price;
	}

	/**
	 * @return the itemId
	 */
	public Integer getItemId() {
		return itemId;
	}
	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
	/**
	 * @return the cuisine
	 */
	public String getCuisine() {
		return cuisine;
	}
	/**
	 * @param cuisine the cuisine to set
	 */
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
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
	 * @return the itemType
	 */
	public Type getItemType() {
		return itemType;
	}

	/**
	 * @param itemType the itemType to set
	 */
	public void setItemType(Type itemType) {
		this.itemType = itemType;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", category=" + category + ", cuisine=" + cuisine
				+ ", itemType=" + itemType + ", price=" + price + "]";
	}

	
	
	
}
