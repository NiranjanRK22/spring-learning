/**
 * 
 */
package com.vaccinationapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.vaccinationapp.exception.DataNotFoundException;
import com.vaccinationapp.model.CovidVaccination;
import com.vaccinationapp.model.Vaccine;

/**
 * @author NiranjanRamakrishna
 *
 */
@Repository
public class CovidVaccinationRepoImpl implements ICovidVaccinationRepository {

	private JdbcTemplate jdbcTemplate;

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

	@Override
	public void addCovidVaccination(CovidVaccination covidVaccination) {
		String insertQuery = "insert into covidvaccination values(?,?,?,?,?,?,?,?,?,?)";
		Object[] vaccination = {covidVaccination.getReferenceId(), covidVaccination.getCentreName(),
				covidVaccination.getPersonName(), covidVaccination.getGender(), covidVaccination.getAge(),
				covidVaccination.getDateOfDose(), covidVaccination.getTimeOfDose(), covidVaccination.getVaccineName().toString(),
				covidVaccination.getDose(), covidVaccination.getCity()};

	    jdbcTemplate.update(insertQuery, vaccination);

	}

	@Override
	public void updateCovidVaccination(int referenceId, String personName) {
		String updateQuery = "update covidvaccination set personname=? where referenceid=?";
		jdbcTemplate.update(updateQuery, personName, referenceId);

	}

	@Override
	public void deleteCovidVaccination(int referenceId) {
		String deleteQuery = "delete from covidvaccination where referenceid=?";
		jdbcTemplate.update(deleteQuery, referenceId);

	}

	@Override
	public CovidVaccination findById(int referenceId) throws DataNotFoundException {
		String selectQuery = "select * from covidvaccination where referenceid=?";
		CovidVaccination vaccination = jdbcTemplate.queryForObject(selectQuery, new CovidVaccinationMapper(), referenceId);
		if (vaccination==null)
			throw new DataNotFoundException("Reference id not found");
		return vaccination;
	}

	@Override
	public List<CovidVaccination> findByCentre(String centreName) throws DataNotFoundException {
		String selectQuery = "select * from covidvaccination where centrename=?";
		List<CovidVaccination> covidVaccinationList = jdbcTemplate.query(selectQuery, new CovidVaccinationMapper(), centreName);
		return covidVaccinationList;
	}

	@Override
	public List<CovidVaccination> findByLesserAge(int age) throws DataNotFoundException {
		String selectQuery = "select * from covidvaccination where age<?";
		List<CovidVaccination> covidVaccinationList = jdbcTemplate.query(selectQuery, new CovidVaccinationMapper(), age);
		return covidVaccinationList;
	}

	@Override
	public List<CovidVaccination> findByGender(String gender) throws DataNotFoundException {
		String selectQuery = "select * from covidvaccination where gender=?";
		List<CovidVaccination> covidVaccinationList = jdbcTemplate.query(selectQuery, new CovidVaccinationMapper(), gender);
		return covidVaccinationList;
	}

	@Override
	public List<CovidVaccination> findByVaccine(String vaccineName) throws DataNotFoundException {
		String selectQuery = "select * from covidvaccination where vaccinename=?";
		List<CovidVaccination> covidVaccinationList = jdbcTemplate.query(selectQuery, new CovidVaccinationMapper(), vaccineName);
		return covidVaccinationList;
	}

	@Override
	public List<CovidVaccination> findByCity(String city) throws DataNotFoundException {
		String selectQuery = "select * from covidvaccination where city=?";
		List<CovidVaccination> covidVaccinationList = jdbcTemplate.query(selectQuery, new CovidVaccinationMapper(), city);
		return covidVaccinationList;
	}



	@Override
	public List<CovidVaccination> findAll() {
		String selectQuery = "select * from covidvaccination";
		List<CovidVaccination> covidVaccinationList = jdbcTemplate.query(selectQuery, new CovidVaccinationMapper());
		return covidVaccinationList;
	}



	@Override
	public List<CovidVaccination> findByDateOfDoseRange(LocalDate start, LocalDate end) throws DataNotFoundException {
		String selectQuery = "select * from covidvaccination where dateofdose between ? and ?";
		List<CovidVaccination> covidVaccinationList = jdbcTemplate.query(selectQuery, new CovidVaccinationMapper(), start, end);
		return covidVaccinationList;
	}



	@Override
	public List<CovidVaccination> findByDose(int dose) throws DataNotFoundException {
		String selectQuery = "select * from covidvaccination where dose = ?";
		List<CovidVaccination> covidVaccinationList = jdbcTemplate.query(selectQuery, new CovidVaccinationMapper(), dose);
		return covidVaccinationList;
	}

}
