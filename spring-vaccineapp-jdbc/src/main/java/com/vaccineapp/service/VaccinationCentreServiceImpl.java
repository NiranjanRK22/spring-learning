package com.vaccineapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaccineapp.exception.CentreNotFoundException;
import com.vaccineapp.model.VaccinationCentre;
import com.vaccineapp.repository.IVaccinationCentreRepository;

@Service
public class VaccinationCentreServiceImpl implements IVaccinationCentreService{

	
	private IVaccinationCentreRepository vaccinationCentreRepo;
	
	
	/**
	 * @param vaccinationCentreRepo the vaccinationCentreRepo to set
	 */
	@Autowired
	public void setVaccinationCentreRepo(IVaccinationCentreRepository vaccinationCentreRepo) {
		this.vaccinationCentreRepo = vaccinationCentreRepo;
	}

	@Override
	public void addVaccinationCentre(VaccinationCentre vaccinationCentre) {
		vaccinationCentreRepo.addVaccinationCentre(vaccinationCentre);
		
	}

	@Override
	public void updateVaccinationCentre(int centreId, String centreName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteVaccinationCentre(int centreId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public VaccinationCentre getById(int centreId) throws CentreNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
