/**
 * 
 */
package com.vaccinationapp.model;

/**
 * @author NiranjanRamakrishna
 *
 */
public enum Vaccine {
	COVISHIELD("COVISHIELD"), COVAXIN("COVAXIN"), SPUTNIK("SPUTNIK");

	private final String vaccineName;

	/**
	 * @param vaccineName
	 */
	private Vaccine(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	/**
	 * @return the vaccineName
	 */
	public String getVaccineName() {
		return vaccineName;
	}

}
