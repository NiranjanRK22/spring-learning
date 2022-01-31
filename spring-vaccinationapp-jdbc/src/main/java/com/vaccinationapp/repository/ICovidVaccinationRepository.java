/**
 * 
 */
package com.vaccinationapp.repository;

import java.time.LocalDate;
import java.util.List;

import com.vaccinationapp.exception.DataNotFoundException;
import com.vaccinationapp.model.CovidVaccination;
import com.vaccinationapp.model.Vaccine;

/**
 * @author NiranjanRamakrishna
 *
 */
public interface ICovidVaccinationRepository {
      
	void addCovidVaccination(CovidVaccination covidVaccination);
	void updateCovidVaccination(int referenceId, String personName);
	void deleteCovidVaccination(int referenceId);
	CovidVaccination findById(int referenceId) throws DataNotFoundException;
	
	List<CovidVaccination> findAll();
	
	List<CovidVaccination> findByCentre(String centreName) throws DataNotFoundException;
	List<CovidVaccination> findByLesserAge(int age) throws DataNotFoundException;
	List<CovidVaccination> findByGender(String gender) throws DataNotFoundException;
	List<CovidVaccination> findByVaccine(String vaccineName) throws DataNotFoundException;
	List<CovidVaccination> findByCity(String city) throws DataNotFoundException;
	List<CovidVaccination> findByDateOfDoseRange(LocalDate start, LocalDate end) throws DataNotFoundException;
	List<CovidVaccination> findByDose(int dose) throws DataNotFoundException;
}
