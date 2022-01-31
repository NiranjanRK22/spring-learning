package com.shristi.javabased;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.shristi.javabased");
        
		String[] beanNames = context.getBeanDefinitionNames();
		Stream.of(beanNames).forEach(System.out::println);
		
		Vehicle vehicle = context.getBean("getVehicle", Vehicle.class);
		System.out.println(vehicle);
		
		Vehicle vehicle1 = context.getBean("vehicle",Vehicle.class);
		System.out.println(vehicle1);
		
		vehicle.getEngine().setMileage(45);
		System.out.println(vehicle);
		
		vehicle.getEngine().setMileage(45);
		System.out.println(vehicle1);
		
	}

}
