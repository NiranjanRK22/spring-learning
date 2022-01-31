package com.vaccinationapp.service;

import java.time.LocalDate;
import java.util.List;

import com.vaccinationapp.exception.DataNotFoundException;
import com.vaccinationapp.model.CovidVaccination;
import com.vaccinationapp.model.Vaccine;

public interface ICovidVaccinationService {
        
	void addCovidVaccination(CovidVaccination covidVaccination);
	void updateCovidVaccination(CovidVaccination covidVaccination);
	void deleteCovidVaccination(int referenceId);
	
	
	CovidVaccination getById(int referenceId) throws DataNotFoundException;
	List<CovidVaccination> getAll();
	List<CovidVaccination> getByCentre(String centreName) throws DataNotFoundException;
	List<CovidVaccination> getByLesserAge(int age) throws DataNotFoundException;
	List<CovidVaccination> getByGender(String gender) throws DataNotFoundException;
	List<CovidVaccination> getByVaccine(String vaccineName) throws DataNotFoundException;
	List<CovidVaccination> getByCity(String city) throws DataNotFoundException;
	List<CovidVaccination> getByDateOfDoseRange(LocalDate start, LocalDate end) throws DataNotFoundException;
	List<CovidVaccination> getByDose(int dose) throws DataNotFoundException;
	
}
