package com.vehicleapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Vehicle {
	 @Id
	 @Column(name="vehicleid")
	 @GeneratedValue(generator="vehicle_seq", strategy=GenerationType.AUTO) 
	 @SequenceGenerator(name="vehicle_seq", sequenceName="vehicle_sequence", initialValue=100, allocationSize=1)
     private Integer vehicleId;
	 @Column(name="vehiclename", length=20)
     private String vehicleName;
	 @Column(length=20)
     private String model;
     private int mileage;
     @Enumerated(EnumType.STRING)
     @Column(name="vehicletype", length=20)
     private VehicleType vehicleType;
     @Column(name="topspeed", length=10)
     private String topSpeed;
     @Column(name="fueltankcapacity")
     private double fuelTankCapacity;
     private String color;
     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name="engineid")
     private Engine engine;
	/**
	 * 
	 */
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param vehicleName
	 * @param model
	 * @param mileage
	 * @param vehicleType
	 * @param topSpeed
	 * @param fuelTankCapacity
	 * @param color
	 * @param engine
	 */
	public Vehicle(String vehicleName, String model, int mileage, VehicleType vehicleType, String topSpeed,
			double fuelTankCapacity, String color, Engine engine) {
		super();
		this.vehicleName = vehicleName;
		this.model = model;
		this.mileage = mileage;
		this.vehicleType = vehicleType;
		this.topSpeed = topSpeed;
		this.fuelTankCapacity = fuelTankCapacity;
		this.color = color;
		this.engine = engine;
	}
	/**
	 * @return the vehicleId
	 */
	public Integer getVehicleId() {
		return vehicleId;
	}
	/**
	 * @param vehicleId the vehicleId to set
	 */
	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}
	/**
	 * @return the vehicleName
	 */
	public String getVehicleName() {
		return vehicleName;
	}
	/**
	 * @param vehicleName the vehicleName to set
	 */
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the mileage
	 */
	public int getMileage() {
		return mileage;
	}
	/**
	 * @param mileage the mileage to set
	 */
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	/**
	 * @return the vehicleType
	 */
	public VehicleType getVehicleType() {
		return vehicleType;
	}
	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	/**
	 * @return the topSpeed
	 */
	public String getTopSpeed() {
		return topSpeed;
	}
	/**
	 * @param topSpeed the topSpeed to set
	 */
	public void setTopSpeed(String topSpeed) {
		this.topSpeed = topSpeed;
	}
	/**
	 * @return the fuelTankCapacity
	 */
	public double getFuelTankCapacity() {
		return fuelTankCapacity;
	}
	/**
	 * @param fuelTankCapacity the fuelTankCapacity to set
	 */
	public void setFuelTankCapacity(double fuelTankCapacity) {
		this.fuelTankCapacity = fuelTankCapacity;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the engine
	 */
	public Engine getEngine() {
		return engine;
	}
	/**
	 * @param engine the engine to set
	 */
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", model=" + model + ", mileage="
				+ mileage + ", vehicleType=" + vehicleType + ", topSpeed=" + topSpeed + ", fuelTankCapacity="
				+ fuelTankCapacity + ", color=" + color + ", engine=" + engine + "]";
	}
     
     
}
