package com.hotelapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Hotel {
    @Id
    @Column(name="hotelid")
    @GeneratedValue(generator="hotel_seq", strategy=GenerationType.AUTO) 
    @SequenceGenerator(name="hotel_seq", sequenceName="hotel_sequence", initialValue=1, allocationSize=1)
	private Integer hotelId;
    @Column(length=20)
	private String name;
    @Column(length=20)
    @Enumerated(EnumType.STRING)
	private Type type;
    @Column(length=20)
    private String city;
	private double rating;
	
	@OneToMany(cascade=CascadeType.ALL, fetch= FetchType.EAGER)
	@JoinColumn(name="hotelid") //this column will be added to item table. refers to foreign key
	private Set<Item> itemList;

	/**
	 * 
	 */
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param hotelId
	 * @param name
	 * @param type
	 * @param city
	 * @param rating
	 * @param itemList
	 */
	public Hotel(String name, Type type, String city, double rating, Set<Item> itemList) {
		super();
		this.name = name;
		this.type = type;
		this.city = city;
		this.rating = rating;
		this.itemList = itemList;
	}


	/**
	 * @return the hotelId
	 */
	public Integer getHotelId() {
		return hotelId;
	}

	/**
	 * @param hotelId the hotelId to set
	 */
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}

	/**
	 * @return the itemList
	 */
	public Set<Item> getItemList() {
		return itemList;
	}

	/**
	 * @param itemList the itemList to set
	 */
	public void setItemList(Set<Item> itemList) {
		this.itemList = itemList;
	}
	

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", name=" + name + ", type=" + type + ", city=" + city + ", rating="
				+ rating + ", itemList=" + itemList + "]";
	}


	
}
