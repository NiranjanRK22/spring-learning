/**
 * 
 */
package com.vaccinationapp.repository;



import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vaccinationapp.exception.DataNotFoundException;
import com.vaccinationapp.model.CovidVaccination;
import com.vaccinationapp.model.Vaccine;

/**
 * @author NiranjanRamakrishna
 *
 */
@Repository
public interface ICovidVaccinationRepository extends JpaRepository<CovidVaccination, Integer>{
      //Derived queries
	List<CovidVaccination> findByCentreName(String centreName);
	List<CovidVaccination> findByAgeLessThan(int age);
	List<CovidVaccination> findByGender(String gender);
	List<CovidVaccination> findByCity(String city);
	List<CovidVaccination> findByDateOfDoseBetween(LocalDate start, LocalDate end);
	
}
