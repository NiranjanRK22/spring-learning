package com.rentalapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
/**
 * 
 * @author NiranjanRamakrishna
 *
 */
@Entity
@Table(name="rentalproperty") //to give different table name
@NamedQuery(name="findByCatType", query="from RentalProperty r where r.category=?1 and r.type=?2")
public class RentalProperty {
	
    private String name;
    private String category; 
    @Id
    @Column(name="propertyid")
    @GeneratedValue(generator="property_seq", strategy=GenerationType.AUTO) 
    @SequenceGenerator(name="property_seq", sequenceName="property_sequence", initialValue=200, allocationSize=10)       
    private Integer propertyId;
    private String type; 
    private String bedrooms; 
    private String area;
    @Column(name="rentexpected")
    private double rentExpected;
    private String location;
    private String city;
    @Column(name="securitydeposit")
    private double securityDeposit;
    
	public RentalProperty() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param name
	 * @param category
	 * @param type
	 * @param bedrooms
	 * @param area
	 * @param rentExpected
	 * @param location
	 * @param city
	 * @param securityDeposit
	 */
	public RentalProperty(String name, String category, String type, String bedrooms, String area, double rentExpected,
			String location, String city, double securityDeposit) {
		super();
		this.name = name;
		this.category = category;
		this.type = type;
		this.bedrooms = bedrooms;
		this.area = area;
		this.rentExpected = rentExpected;
		this.location = location;
		this.city = city;
		this.securityDeposit = securityDeposit;
	}

    /**
     * 
     * @return
     */
	public String getName() {
		return name;
	}
    /**
     * 
     * @param name
     */
	public void setName(String name) {
		this.name = name;
	}
    /**
     * 
     * @return
     */
	public String getCategory() {
		return category;
	}
    /**
     * 
     * @param category
     */
	public void setCategory(String category) {
		this.category = category;
	}
    /**
     * 
     * @return
     */
	public Integer getPropertyId() {
		return propertyId;
	}
    /**
     * 
     * @param propertyId
     */
	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}
    /**
     * 
     * @return
     */
	public String getType() {
		return type;
	}
    /**
     * 
     * @param type
     */
	public void setType(String type) {
		this.type = type;
	}
    /**
     * 
     * @return
     */
	public String getBedrooms() {
		return bedrooms;
	}
    /**
     * 
     * @param bedrooms
     */
	public void setBedrooms(String bedrooms) {
		this.bedrooms = bedrooms;
	}
    /**
     * 
     * @return
     */
 	public String getArea() {
		return area;
	}
    /**
     * 
     * @param area
     */
	public void setArea(String area) {
		this.area = area;
	}
    /**
     * 
     * @return
     */
	public double getRentExpected() {
		return rentExpected;
	}
    /**
     * 
     * @param rentExpected
     */
	public void setRentExpected(double rentExpected) {
		this.rentExpected = rentExpected;
	}
    /**
     * 
     * @return
     */
	public String getLocation() {
		return location;
	}
    /**
     * 
     * @param location
     */
 	public void setLocation(String location) {
		this.location = location;
	}
    /**
     * 
     * @return
     */
 	public String getCity() {
		return city;
	}
    /**
     * 
     * @param city
     */
	public void setCity(String city) {
		this.city = city;
	}
    /**
     * 
     * @return
     */
	public double getSecurityDeposit() {
		return securityDeposit;
	}
    /**
     * 
     * @param securityDeposit
     */
	public void setSecurityDeposit(double securityDeposit) {
		this.securityDeposit = securityDeposit;
	}

	@Override
	public String toString() {
		return "RentalProperty [name=" + name + ", category=" + category + ", propertyId=" + propertyId + ", type="
				+ type + ", bedrooms=" + bedrooms + ", area=" + area + ", rentExpected=" + rentExpected + ", location="
				+ location + ", city=" + city + ", securityDeposit=" + securityDeposit + "]";
	}   
    
}
