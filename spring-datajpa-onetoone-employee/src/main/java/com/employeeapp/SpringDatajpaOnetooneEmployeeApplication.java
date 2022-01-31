package com.employeeapp;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employeeapp.model.Address;
import com.employeeapp.model.Employee;
import com.employeeapp.service.IEmployeeService;

@SpringBootApplication
public class SpringDatajpaOnetooneEmployeeApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetooneEmployeeApplication.class, args);
	}
    
	@Autowired
	private IEmployeeService employeeService;
	
	@Override
	public void run(String... args) throws Exception {
		Address address = new Address(1, "james street", "near alpha hotel", "hyderabad", "telangana", 500020);
		Employee employee = new Employee("ajay", LocalDate.parse("1997-07-12"), 30000, "o +ve", "SDE", 2, 97751457, "ajay87@gmail.com", address);
		//employeeService.addEmployee(employee);
	}

}
