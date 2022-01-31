package com.vaccinationapp.model;

import java.time.LocalDate;
import java.time.LocalTime;
/**
 * 
 * @author NiranjanRamakrishna
 * @version 1.0
 */
public class CovidVaccination {

	private Integer referenceId;
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
	public CovidVaccination() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param referenceId
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
	public CovidVaccination(Integer referenceId, String centreName, String personName, String gender, int age,
			LocalDate dateOfDose, LocalTime timeOfDose, Vaccine vaccineName, int dose, String city) {
		super();
		this.referenceId = referenceId;
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
	 * @return the referenceId
	 */
	public Integer getReferenceId() {
		return referenceId;
	}
	/**
	 * @param referenceId the referenceId to set
	 */
	public void setReferenceId(Integer referenceId) {
		this.referenceId = referenceId;
	}
	/**
	 * @return the centreName
	 */
	public String getCentreName() {
		return centreName;
	}
	/**
	 * @param centreName the centreName to set
	 */
	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}
	/**
	 * @return the nameOfPerson
	 */
	public String getPersonName() {
		return personName;
	}
	/**
	 * @param nameOfPerson the nameOfPerson to set
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
		return "CovidVaccination [referenceId=" + referenceId + ", centreName=" + centreName + ", personName="
				+ personName + ", gender=" + gender + ", age=" + age + ", dateOfDose=" + dateOfDose + ", timeOfDose="
				+ timeOfDose + ", vaccineName=" + vaccineName + ", dose=" + dose + ", city=" + city + "]";
	}
	

}
