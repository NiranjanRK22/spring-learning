package com.employeeapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Address {
	@Id
	@Column(name="houseid")
	@GeneratedValue(generator="addr_seq", strategy=GenerationType.AUTO) 
    @SequenceGenerator(name="addr_seq", sequenceName="address_seq", initialValue=1, allocationSize=1) 
    private Integer HouseId;
    private int floorNumber;
    @Column(length=20)
    private String street;
    @Column(length=20)
    private String landmark;
    @Column(length=20)
    private String city;
    @Column(length=20)
    private String state;
    private int zipCode;
	/**
	 * 
	 */
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param floorNumber
	 * @param street
	 * @param landmark
	 * @param city
	 * @param state
	 * @param zipCode
	 */
	public Address(int floorNumber, String street, String landmark, String city, String state, int zipCode) {
		super();
		this.floorNumber = floorNumber;
		this.street = street;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	/**
	 * @return the houseId
	 */
	public Integer getHouseId() {
		return HouseId;
	}
	/**
	 * @param houseId the houseId to set
	 */
	public void setHouseId(Integer houseId) {
		HouseId = houseId;
	}
	/**
	 * @return the floorNumber
	 */
	public int getFloorNumber() {
		return floorNumber;
	}
	/**
	 * @param floorNumber the floorNumber to set
	 */
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the landmark
	 */
	public String getLandmark() {
		return landmark;
	}
	/**
	 * @param landmark the landmark to set
	 */
	public void setLandmark(String landmark) {
		this.landmark = landmark;
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
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zipCode
	 */
	public int getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [HouseId=" + HouseId + ", floorNumber=" + floorNumber + ", street=" + street + ", landmark="
				+ landmark + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}
    
}
