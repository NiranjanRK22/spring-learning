package com.greetapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.greetapp.basic.Employee;
import com.shristi.autowiring.ShapeFactory;

@SpringBootApplication
@ComponentScan("com")
public class SpringBootBasicApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicApplication.class, args);
	}
    
	@Autowired
	Employee employee;
	
	@Autowired
	ShapeFactory shapeFactory;
	
	@Override
	public void run(String... args) throws Exception {
	      System.out.println(employee);
		 shapeFactory.printShape("square", 10, 20);
	}

}
