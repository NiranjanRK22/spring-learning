package com.vaccineapp;



import java.sql.Date;
import java.sql.Time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vaccineapp.model.VaccinationCentre;
import com.vaccineapp.model.Vaccine;
import com.vaccineapp.service.IVaccinationCentreService;

   
   
@SpringBootApplication
public class SpringVaccineappJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringVaccineappJdbcApplication.class, args);
	}
	
	private IVaccinationCentreService vaccinationCentreService;

	/**
	 * @param vaccinationCentreService the vaccinationCentreService to set
	 */
	@Autowired
	public void setVaccinationCentreService(IVaccinationCentreService vaccinationCentreService) {
		this.vaccinationCentreService = vaccinationCentreService;
	}


	@Override
	public void run(String... args) throws Exception {
		VaccinationCentre vaccination = new VaccinationCentre(105,"apollo", "divya", "female", 21,Date.valueOf("2021-11-12").toLocalDate(), Time.valueOf("13:15:00").toLocalTime() ,Vaccine.SPUTNIK, 2, "karimnagar");
		vaccinationCentreService.addVaccinationCentre(vaccination);
		System.out.println("centre added");
		
	}

	

}
