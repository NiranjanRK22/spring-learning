package com.vaccinationapp;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vaccinationapp.model.CovidVaccination;
import com.vaccinationapp.model.Vaccine;
import com.vaccinationapp.service.ICovidVaccinationService;


@SpringBootApplication
public class SpringVaccinationappJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringVaccinationappJdbcApplication.class, args);
	}
	
	private ICovidVaccinationService covidVaccinationService;
	
	

	/**
	 * @param covidVaccinationService the covidVaccinationService to set
	 */
	@Autowired
	public void setCovidVaccinationService(ICovidVaccinationService covidVaccinationService) {
		this.covidVaccinationService = covidVaccinationService;
	}


	@Override
	public void run(String... args) throws Exception {
		CovidVaccination vaccination = new CovidVaccination(108,"tenet", "ajay", "male", 29, LocalDate.parse("2021-10-05"), LocalTime.parse("11:00:00"),Vaccine.COVAXIN, 2, "warangal");
		//covidVaccinationService.addCovidVaccination(vaccination);
	   // System.out.println("vaccination data added");
	    
	    //covidVaccinationService.updateCovidVaccination(105, "pavani");
	    //System.out.println("vaccination data updated");
		
		//covidVaccinationService.deleteCovidVaccination(106);
		
		System.out.println("Get all people who are vaccinated");
		covidVaccinationService.getAll().forEach(System.out::println);
		System.out.println();
		
		System.out.println("Vaccinated person with reference id");
		System.out.println(covidVaccinationService.getById(108));
		System.out.println();
		
		System.out.println("Retrieving all vaccinated people in this city");
		covidVaccinationService.getByCity("warangal").forEach(System.out::println);
		System.out.println();
		
		System.out.println("Retrieving all vaccinated people with this gender");
		covidVaccinationService.getByGender("female").forEach(System.out::println);
		System.out.println();
		
		System.out.println("Retrieving all vaccinated people who have taken this vaccine");
		covidVaccinationService.getByVaccine("covaxin").forEach(System.out::println);
		System.out.println();
		
		System.out.println("Retrieving all vaccinated people who got vaccinated in these dates");
		covidVaccinationService.getByDateOfDoseRange(LocalDate.parse("2021-10-04"), LocalDate.parse("2021-12-12")).forEach(System.out::println);
		System.out.println();
		
		System.out.println("Retrieving all vaccinated people with this dose");
		covidVaccinationService.getByDose(1).forEach(System.out::println);
		
	}

}
