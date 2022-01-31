package com.studentapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="studaddress")
public class Address {
	@Id
    @Column(name="addressid")
    @GeneratedValue(generator="address_seq", strategy=GenerationType.AUTO) 
    @SequenceGenerator(name="address_seq", sequenceName="address_sequence", initialValue=1, allocationSize=1)
    private Integer addressId;
	@Column(length=20)
    private String city;
	@Column(length=20)
    private String state;
	/**
	 * 
	 */
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param city
	 * @param state
	 */
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	/**
	 * @return the addressId
	 */
	public Integer getAddressId() {
		return addressId;
	}
	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
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
	@Override
	public String toString() {
		return "Address [AddressId=" + addressId + ", city=" + city + ", state=" + state + "]";
	}
	
	
}
