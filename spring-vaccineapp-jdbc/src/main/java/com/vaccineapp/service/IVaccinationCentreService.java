package com.vaccineapp.service;

import com.vaccineapp.exception.CentreNotFoundException;
import com.vaccineapp.model.VaccinationCentre;

public interface IVaccinationCentreService {
      
	//void addCovidVaccination
	
	void addVaccinationCentre(VaccinationCentre vaccinationCentre);
	void updateVaccinationCentre(int centreId, String centreName);
	void deleteVaccinationCentre(int centreId);
	VaccinationCentre getById(int centreId) throws CentreNotFoundException;
}
