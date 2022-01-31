package com.vaccineapp.repository;

import com.vaccineapp.exception.CentreNotFoundException;
import com.vaccineapp.model.VaccinationCentre;

public interface IVaccinationCentreRepository {
     
	void addVaccinationCentre(VaccinationCentre vaccinationCentre);
	void updateVaccinationCentre(int centreId, String centreName);
	void deleteVaccinationCentre(int centreId);
	VaccinationCentre findById(int centreId) throws CentreNotFoundException;
}
