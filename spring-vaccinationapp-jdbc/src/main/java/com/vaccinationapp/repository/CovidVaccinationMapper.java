package com.vaccinationapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.jdbc.core.RowMapper;

import com.vaccinationapp.model.CovidVaccination;
import com.vaccinationapp.model.Vaccine;
/**
 * 
 * @author NiranjanRamakrishna
 *
 */
public class CovidVaccinationMapper implements RowMapper<CovidVaccination> {

	@Override
	public CovidVaccination mapRow(ResultSet rs, int rowNum) throws SQLException {
		int referenceId = rs.getInt("referenceid");
		String centreName = rs.getString("centrename");
		String personName = rs.getString("personname");
		String gender = rs.getString("gender");
		int age = rs.getInt("age");
	    String dateOfDose = rs.getString("dateofdose");
		String timeOfDose = rs.getString("timeofdose");
		String vaccineName = rs.getString("vaccinename").toUpperCase();
		int dose = rs.getInt("dose");
		String city = rs.getString("city");
		
		CovidVaccination vaccination = new CovidVaccination(referenceId, centreName, personName, gender, age, LocalDate.parse(dateOfDose), LocalTime.parse(timeOfDose), Vaccine.valueOf(vaccineName), dose, city);	
	    return vaccination;
	}

}
