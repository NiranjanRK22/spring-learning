package com.rentalapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rentalapp.model.RentalProperty;
import com.rentalapp.service.IRentalPropertyService;

@SpringBootApplication
public class SpringRentalappDatajpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringRentalappDatajpaApplication.class, args);
	}
    
	@Autowired
	IRentalPropertyService propertyService;
	@Override
	public void run(String... args) throws Exception {
		RentalProperty property = new RentalProperty("3 bhk house", "boys", "indpendent", "3bhk", "2500 sqft", 3000, "bachupally", "hyd", 10000);
		
		//propertyService.addRentalProperty(property);
		
//		RentalProperty newproperty = propertyService.getById(107);
//		newproperty.setBedrooms("4 bhk");
//		newproperty.setCategory("Boys");
//		newproperty.setRentExpected(3500);
//		newproperty.setName("4 bhk independent house");
//		newproperty.setLocation("madhapur");
//		newproperty.setCity("hyderabad");
//		propertyService.updateRentalProperty(newproperty);
		
		System.out.println("view all properties");
		propertyService.getAll().forEach(System.out::println);
		
		System.out.println("View properties by city");
		propertyService.getByCity("hyd").forEach(System.out::println);
		
		System.out.println("View properties by location");
		propertyService.getByLocation("bhills").forEach(System.out::println);
		
		System.out.println("view properties by category");
		propertyService.getByCategory("family").forEach(System.out::println);
		
		System.out.println("view properties by type");
		propertyService.getByType("apartment").forEach(System.out::println);
		
		System.out.println("view properties by rent range");
		propertyService.getByRentRange(5000, 7000).forEach(System.out::println);
		
		System.out.println("view properties by security deposit");
		propertyService.getByLesserDeposit(15000).forEach(System.out::println);
		
		System.out.println("view property by id");
		System.out.println(propertyService.getById(102));
	
		System.out.println("view property by category and city");
		propertyService.findByCatAndCity("family", "hyd").forEach(System.out::println);
		
		System.out.println("view property by category and type");
		propertyService.findByCatAndType("Boys", "independent").forEach(System.out::println);
	    
		System.out.println("view property by rent and type");
		propertyService.findByTypeAndRent("independent", 15000).forEach(System.out::println);
	    
		propertyService.updateProperty(200, 5000);
	}

}
