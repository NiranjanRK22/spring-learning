package com.rentalapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rentalapp.model.RentalProperty;
import com.rentalapp.service.IRentalPropertyService;

@SpringBootApplication
public class SpringRentalappJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringRentalappJdbcApplication.class, args);
	}
    
	@Autowired
	private IRentalPropertyService rentalPropertyService;
	
	@Override
	public void run(String... args) throws Exception {
		RentalProperty property = new RentalProperty("3 bhk apartment", "family", 104, "apartment", "3bhk", "2500 sqft", 7000, "kukatpally", "hyd", 500045);
		//rentalPropertyService.addRentalProperty(property);
		//System.out.println("property added");
		System.out.println("property updated");
		//rentalPropertyService.updateRentalProperty(100, 5000);
		//rentalPropertyService.deleteRentalProperty(105);
		
		System.out.println("View all properties");
		rentalPropertyService.getAll().forEach(System.out::println);
		
		System.out.println("View properties by city");
		rentalPropertyService.getByCity("hyd").forEach(System.out::println);
		
		System.out.println("View properties by location");
		rentalPropertyService.getByLocation("bhills").forEach(System.out::println);
		
		System.out.println("view properties by category");
		rentalPropertyService.getByCategory("family").forEach(System.out::println);
		
		System.out.println("view properties by type");
		rentalPropertyService.getByType("apartment").forEach(System.out::println);
		
		System.out.println("view properties by rent range");
		rentalPropertyService.getByRentRange(5000, 7000).forEach(System.out::println);
		
		System.out.println("view properties by security deposit");
		rentalPropertyService.getByLesserDeposit(50003).forEach(System.out::println);
		
		System.out.println("view property by id");
		System.out.println(rentalPropertyService.getById(102));;
	}

}
