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
public class SpringVaccinationappDatajpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringVaccinationappDatajpaApplication.class, args);
	}
    
	@Autowired
	ICovidVaccinationService covidVaccinationService;
	@Override
	public void run(String... args) throws Exception {
		CovidVaccination vaccination = new CovidVaccination("apollo", "john", "male", 45, LocalDate.parse("2021-12-10"), LocalTime.parse("11:00:00"),Vaccine.SPUTNIK, 2, "karimnagar");
		//vaccinationService.addCovidVaccination(vaccination);
		
		//CovidVaccination newVaccination = covidVaccinationService.getById(110);
		//newVaccination.setAge(27);
		//newVaccination.setCity("warangal");
		//covidVaccinationService.updateCovidVaccination(newVaccination);
		
		covidVaccinationService.getAll().forEach(System.out::println);
		
		//covidVaccinationService.getByLesserAge(25).forEach(System.out::println);
	}

}
