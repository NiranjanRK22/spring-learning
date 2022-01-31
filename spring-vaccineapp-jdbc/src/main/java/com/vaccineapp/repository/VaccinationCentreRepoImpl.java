package com.vaccineapp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vaccineapp.exception.CentreNotFoundException;
import com.vaccineapp.model.VaccinationCentre;

@Repository
public class VaccinationCentreRepoImpl implements IVaccinationCentreRepository{
	
	private JdbcTemplate jdbcTemplate;
	

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addVaccinationCentre(VaccinationCentre vaccinationCentre) {
		String insertQuery = "insert into vaccinationcentre values(?,?,?,?,?,?,?,?,?,?)";
		Object[] centre = {vaccinationCentre.getcentreId(), vaccinationCentre.getcentreName(), 
				vaccinationCentre.getPersonName(), vaccinationCentre.getGender(), 
				vaccinationCentre.getAge(), vaccinationCentre.getDateOfDose(), 
				vaccinationCentre.getTimeOfDose(), vaccinationCentre.getVaccineName().toString(), 
				vaccinationCentre.getDose(), vaccinationCentre.getCity()
				};
		jdbcTemplate.update(insertQuery, centre);
		
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
	public VaccinationCentre findById(int centreId) throws CentreNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
