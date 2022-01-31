package com.studentapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="biaddress")
public class BiAddress {
	@Id
    @Column(name="addressid")
    @GeneratedValue(generator="biaddress_seq", strategy=GenerationType.AUTO) 
    @SequenceGenerator(name="biaddress_seq", sequenceName="biaddress_sequence", initialValue=1, allocationSize=1)
    private Integer addressId;
	@Column(name="flatno", length=10)
	private String flatNo;
	@Column(name="streetname", length=20)
	private String streetName;
	@Column(length=20)
    private String city;
	@Column(length=20)
    private String state;
	//bidirectional
	//address instace variable is the owner of this relationship
	//ony addressid will be added to bistudent table
	@OneToOne(mappedBy="address")
	BiStudent student;
	/**
	 * 
	 */
	public BiAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param flatNo
	 * @param streetName
	 * @param city
	 * @param state
	 */
	public BiAddress(String flatNo, String streetName, String city, String state) {
		super();
		this.flatNo = flatNo;
		this.streetName = streetName;
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
	/**
	 * @return the student
	 */
	public BiStudent getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(BiStudent student) {
		this.student = student;
	}
	
	/**
	 * @return the flatNo
	 */
	public String getFlatNo() {
		return flatNo;
	}

	/**
	 * @param flatNo the flatNo to set
	 */
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	@Override
	public String toString() {
		return "BiAddress [addressId=" + addressId + ", flatNo=" + flatNo + ", streetName=" + streetName + ", city="
				+ city + ", state=" + state + "]";
	}

	
}
