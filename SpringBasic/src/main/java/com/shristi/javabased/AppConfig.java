package com.shristi.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //class with all bean definitions
public class AppConfig {
    
	
	//spring read the method annotated with @Bean and creates object
	//the name of the spring bean will be the method name
	@Bean
	public Vehicle getVehicle()  {
		Vehicle vehicle = new Vehicle();
		vehicle.setBrand("bajaj");
		vehicle.setPrice(5000);
		vehicle.setEngine(getEngine());
		return vehicle;
	}
	
	@Bean
	public Engine getEngine()  {
		Engine engine = new Engine();
		engine.setMileage(45);
		engine.setType("petrol");
		return engine;
	}
}
