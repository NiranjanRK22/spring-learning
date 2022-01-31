package com.vaccineapp.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class VaccinationCentre {
	
	private Integer centreId;
	private String centreName;
	private String personName;
	private String gender;
	private int age;
	private LocalDate dateOfDose;
	private LocalTime timeOfDose;
	private Vaccine vaccineName;
	private int dose;
	private String city;
	/**
	 * 
	 */
	public VaccinationCentre() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param centreId
	 * @param centreName
	 * @param personName
	 * @param gender
	 * @param age
	 * @param dateOfDose
	 * @param timeOfDose
	 * @param vaccineName
	 * @param dose
	 * @param city
	 */
	public VaccinationCentre(Integer centreId, String centreName, String personName, String gender, int age,
			LocalDate dateOfDose, LocalTime timeOfDose, Vaccine vaccineName, int dose, String city) {
		super();
		this.centreId = centreId;
		this.centreName = centreName;
		this.personName = personName;
		this.gender = gender;
		this.age = age;
		this.dateOfDose = dateOfDose;
		this.timeOfDose = timeOfDose;
		this.vaccineName = vaccineName;
		this.dose = dose;
		this.city = city;
	}
	/**
	 * @return the centreId
	 */
	public Integer getcentreId() {
		return centreId;
	}
	/**
	 * @param centreId the centreId to set
	 */
	public void setcentreId(Integer centreId) {
		this.centreId = centreId;
	}
	/**
	 * @return the centreName
	 */
	public String getcentreName() {
		return centreName;
	}
	/**
	 * @param centreName the centreName to set
	 */
	public void setcentreName(String centreName) {
		this.centreName = centreName;
	}
	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}
	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the dateOfDose
	 */
	public LocalDate getDateOfDose() {
		return dateOfDose;
	}
	/**
	 * @param dateOfDose the dateOfDose to set
	 */
	public void setDateOfDose(LocalDate dateOfDose) {
		this.dateOfDose = dateOfDose;
	}
	/**
	 * @return the timeOfDose
	 */
	public LocalTime getTimeOfDose() {
		return timeOfDose;
	}
	/**
	 * @param timeOfDose the timeOfDose to set
	 */
	public void setTimeOfDose(LocalTime timeOfDose) {
		this.timeOfDose = timeOfDose;
	}
	/**
	 * @return the vaccineName
	 */
	public Vaccine getVaccineName() {
		return vaccineName;
	}
	/**
	 * @param vaccineName the vaccineName to set
	 */
	public void setVaccineName(Vaccine vaccineName) {
		this.vaccineName = vaccineName;
	}
	/**
	 * @return the dose
	 */
	public int getDose() {
		return dose;
	}
	/**
	 * @param dose the dose to set
	 */
	public void setDose(int dose) {
		this.dose = dose;
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
		return "VaccinationCentre [centreId=" + centreId + ", centreName=" + centreName + ", personName=" + personName
				+ ", gender=" + gender + ", age=" + age + ", dateOfDose=" + dateOfDose + ", timeOfDose=" + timeOfDose
				+ ", vaccineName=" + vaccineName + ", dose=" + dose + ", city=" + city + "]";
	}

	
}
