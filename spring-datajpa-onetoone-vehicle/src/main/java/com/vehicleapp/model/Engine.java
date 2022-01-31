package com.vehicleapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Engine {
	@Id
    @Column(name="engineid")
    @GeneratedValue(generator="engine_seq", strategy=GenerationType.AUTO) 
    @SequenceGenerator(name="engine_seq", sequenceName="engine_sequence", initialValue=100, allocationSize=1)
     private int engineId;
	@Column(length=10)
     private String capacity;
     private double size;
     @Column(name="fueltype", length=20)
     @Enumerated(EnumType.STRING)
     private FuelType fuelType;
     private int cylinders;
     @Column(name="enginemodel", length=10)
     private String engineModel;
	/**
	 * 
	 */
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param capacity
	 * @param size
	 * @param fuelType
	 * @param cylinders
	 * @param engineModel
	 */
	public Engine(String capacity, double size, FuelType fuelType, int cylinders, String engineModel) {
		super();
		this.capacity = capacity;
		this.size = size;
		this.fuelType = fuelType;
		this.cylinders = cylinders;
		this.engineModel = engineModel;
	}
	/**
	 * @return the engineId
	 */
	public int getEngineId() {
		return engineId;
	}
	/**
	 * @param engineId the engineId to set
	 */
	public void setEngineId(int engineId) {
		this.engineId = engineId;
	}
	/**
	 * @return the capacity
	 */
	public String getCapacity() {
		return capacity;
	}
	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	/**
	 * @return the size
	 */
	public double getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(double size) {
		this.size = size;
	}
	/**
	 * @return the fuelType
	 */
	public FuelType getFuelType() {
		return fuelType;
	}
	/**
	 * @param fuelType the fuelType to set
	 */
	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}
	/**
	 * @return the cylinders
	 */
	public int getCylinders() {
		return cylinders;
	}
	/**
	 * @param cylinders the cylinders to set
	 */
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	/**
	 * @return the engineModel
	 */
	public String getEngineModel() {
		return engineModel;
	}
	/**
	 * @param engineModel the engineModel to set
	 */
	public void setEngineModel(String engineModel) {
		this.engineModel = engineModel;
	}
	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", capacity=" + capacity + ", size=" + size + ", fuelType=" + fuelType
				+ ", cylinders=" + cylinders + ", engineModel=" + engineModel + "]";
	}
	 
}
