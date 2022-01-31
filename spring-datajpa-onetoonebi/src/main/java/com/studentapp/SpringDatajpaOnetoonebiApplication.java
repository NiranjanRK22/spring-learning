package com.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.studentapp.model.BiAddress;
import com.studentapp.model.BiStudent;
import com.studentapp.service.IBiAddressService;
import com.studentapp.service.IBiStudentService;

@SpringBootApplication
public class SpringDatajpaOnetoonebiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetoonebiApplication.class, args);
	}
    
	@Autowired
	IBiStudentService studentService;
	
	@Autowired
	IBiAddressService addressService;
	
	@Override
	public void run(String... args) throws Exception {
		BiAddress address = new BiAddress("b4","nelson road","bangalore", "karnataka");
	    BiStudent student = new BiStudent("priya", "ECE", address);
	    //studentService.addBiStudent(student);
	    
	    //studentService.getAll().forEach(System.out::println);
//	     
//	     studentService.getByCity("hyderabad").forEach(System.out::println);
//	     System.out.println();
//	     studentService.getByDeptAndCity("ECE", "hyderabad").forEach(System.out::println);
//	     System.out.println();
//	     studentService.getByState("telangana");
	    
	    //addressService.getByCity("hyderabad").forEach(System.out::println);
//	   BiAddress address1 = addressService.getByStudentId(2);
//	   address1.getStudent().getDepartment();
	    //System.out.println(addressService.getByStudentId(2).getStudent().getDepartment());
	    //System.out.println(addressService.getByStudentId(2).getStudent().getAddress());
	    addressService.getByName("niranjan").forEach(System.out::println);
	    addressService.getByDepartment("ECE").forEach(System.out::println);
	    addressService.getByNameAndCity("niranjan", "hyderabad").forEach(System.out::println);
	}

}
