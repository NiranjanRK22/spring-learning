/**
 * 
 */
package com.vaccinationapp.service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaccinationapp.exception.DataNotFoundException;
import com.vaccinationapp.model.CovidVaccination;
import com.vaccinationapp.model.Vaccine;
import com.vaccinationapp.repository.ICovidVaccinationRepository;

/**
 * @author NiranjanRamakrishna
 *
 */

@Service
public class CovidVaccinationServiceImpl implements ICovidVaccinationService{
	
	private ICovidVaccinationRepository covidVaccinationRepo;
	

	/**
	 * @param covidVaccinationRepo the covidVaccinationRepo to set
	 */
	@Autowired
	public void setCovidVaccinationRepo(ICovidVaccinationRepository covidVaccinationRepo) {
		this.covidVaccinationRepo = covidVaccinationRepo;
	}

	@Override
	public void addCovidVaccination(CovidVaccination covidVaccination) {
		covidVaccinationRepo.addCovidVaccination(covidVaccination);
		
	}

	@Override
	public void updateCovidVaccination(int referenceId, String personName) {
		covidVaccinationRepo.updateCovidVaccination(referenceId, personName);
		
	}

	@Override
	public void deleteCovidVaccination(int referenceId) {
		covidVaccinationRepo.deleteCovidVaccination(referenceId);
		
	}
	
    /**
     * @param referenceId
     * @throws DataNotFoundException
     */
	@Override
	public CovidVaccination getById(int referenceId) throws DataNotFoundException {
		CovidVaccination covidVaccination = covidVaccinationRepo.findById(referenceId);
		return covidVaccination;
	}
    
	/**
     * @param centreName
     * @throws DataNotFoundException
     */
	@Override
	public List<CovidVaccination> getByCentre(String centreName) throws DataNotFoundException {
		List<CovidVaccination> covidVaccinationList = covidVaccinationRepo.findByCentre(centreName)
				.stream()
				.sorted(Comparator.comparing(CovidVaccination::getAge))
				.collect(Collectors.toList());
		return covidVaccinationList;
	}
    
	/**
     * @param age
     * @throws DataNotFoundException
     */
	@Override
	public List<CovidVaccination> getByLesserAge(int age) throws DataNotFoundException {
		List<CovidVaccination> covidVaccinationList = covidVaccinationRepo.findByLesserAge(age)
				.stream()
				.sorted(Comparator.comparing(CovidVaccination::getAge))
				.collect(Collectors.toList());
		return covidVaccinationList;
	}
    
	/**
     * @param gender
     * @throws DataNotFoundException
     */
	@Override
	public List<CovidVaccination> getByGender(String gender) throws DataNotFoundException {
		List<CovidVaccination> covidVaccinationList = covidVaccinationRepo.findByGender(gender)
				.stream()
				.sorted(Comparator.comparing(CovidVaccination::getPersonName))
				.collect(Collectors.toList());
		return covidVaccinationList;
	}
    
	/**
     * @param vaccineName
     * @throws DataNotFoundException
     */
	@Override
	public List<CovidVaccination> getByVaccine(String vaccineName) throws DataNotFoundException {
		List<CovidVaccination> covidVaccinationList = covidVaccinationRepo.findByVaccine(vaccineName)
				.stream()
				.sorted(Comparator.comparing(CovidVaccination::getPersonName))
				.collect(Collectors.toList());
		return covidVaccinationList;
	}
    
	/**
     * @param city
     * @throws DataNotFoundException
     */
	@Override
	public List<CovidVaccination> getByCity(String city) throws DataNotFoundException {
		List<CovidVaccination> covidVaccinationList = covidVaccinationRepo.findByCity(city)
				.stream()
				.sorted(Comparator.comparing(CovidVaccination::getCentreName))
				.collect(Collectors.toList());
		return covidVaccinationList;
	}
    
	
	@Override
	public List<CovidVaccination> getAll() {
		List<CovidVaccination> covidVaccinationList = covidVaccinationRepo.findAll()
				.stream()
				.sorted(Comparator.comparing(CovidVaccination::getAge))
				.collect(Collectors.toList());
		return covidVaccinationList;
	}
    
	/**
     * @param start
     * @param end
     * @throws DataNotFoundException
     */
	@Override
	public List<CovidVaccination> getByDateOfDoseRange(LocalDate start, LocalDate end) throws DataNotFoundException {
		List<CovidVaccination> covidVaccinationList = covidVaccinationRepo.findByDateOfDoseRange(start, end)
				.stream()
				.sorted(Comparator.comparing(CovidVaccination::getAge))
				.collect(Collectors.toList());
		return covidVaccinationList;
	}
    
	/**
     * @param dose
     * @throws DataNotFoundException
     */
	@Override
	public List<CovidVaccination> getByDose(int dose) throws DataNotFoundException {
		List<CovidVaccination> covidVaccinationList = covidVaccinationRepo.findByDose(dose)
				.stream()
				.sorted(Comparator.comparing(CovidVaccination::getAge))
				.collect(Collectors.toList());
		return covidVaccinationList;
	}

}
