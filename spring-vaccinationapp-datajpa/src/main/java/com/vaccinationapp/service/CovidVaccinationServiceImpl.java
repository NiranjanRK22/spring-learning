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
		covidVaccinationRepo.save(covidVaccination);
		
	}


	@Override
	public void updateCovidVaccination(CovidVaccination covidVaccination) {
		covidVaccinationRepo.save(covidVaccination);
	}


	@Override
	public void deleteCovidVaccination(int referenceId) {
		covidVaccinationRepo.deleteById(referenceId);
	}


	@Override
	public CovidVaccination getById(int referenceId) throws DataNotFoundException {
		return covidVaccinationRepo
				.findById(referenceId)
				.orElseThrow(() -> new DataNotFoundException("invalid id"));
	}


	@Override
	public List<CovidVaccination> getAll() {
		return covidVaccinationRepo.findAll();
	}


	@Override
	public List<CovidVaccination> getByCentre(String centreName) throws DataNotFoundException {
		List<CovidVaccination> vaccinationList = covidVaccinationRepo.findByCentreName(centreName);
		if (vaccinationList.isEmpty())
			throw new DataNotFoundException("data not found with this centre");
		return vaccinationList;
	}


	@Override
	public List<CovidVaccination> getByLesserAge(int age) throws DataNotFoundException {
		List<CovidVaccination> vaccinationList = covidVaccinationRepo.findByAgeLessThan(age);
		if (vaccinationList.isEmpty())
			throw new DataNotFoundException("data not found lesser than this age");
		return vaccinationList;
	}


	@Override
	public List<CovidVaccination> getByGender(String gender) throws DataNotFoundException {
		List<CovidVaccination> vaccinationList = covidVaccinationRepo.findByGender(gender);
		if (vaccinationList.isEmpty())
			throw new DataNotFoundException("data not found with this gender");
		return vaccinationList;
	}


	@Override
	public List<CovidVaccination> getByVaccine(String vaccineName) throws DataNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<CovidVaccination> getByCity(String city) throws DataNotFoundException {
		List<CovidVaccination> vaccinationList = covidVaccinationRepo.findByCity(city);
		if (vaccinationList.isEmpty())
			throw new DataNotFoundException("data not found with this city");
		return vaccinationList;
	}


	@Override
	public List<CovidVaccination> getByDateOfDoseRange(LocalDate start, LocalDate end) throws DataNotFoundException {
		List<CovidVaccination> vaccinationList = covidVaccinationRepo.findByDateOfDoseBetween(start, end);
		if (vaccinationList.isEmpty())
			throw new DataNotFoundException("data not found between these dates");
		return vaccinationList;
	}


	@Override
	public List<CovidVaccination> getByDose(int dose) throws DataNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
