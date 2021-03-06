package com.vehicleapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vehicleapp.model.Engine;
import com.vehicleapp.model.FuelType;
import com.vehicleapp.model.Vehicle;
import com.vehicleapp.model.VehicleType;
import com.vehicleapp.service.IVehicleService;

@SpringBootApplication
public class SpringDatajpaOnetooneVehicleApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetooneVehicleApplication.class, args);
	}
	
	@Autowired
	private IVehicleService vehicleService;

	@Override
	public void run(String... args) throws Exception {
		Engine engine = new Engine("1600 cc", 4.5, FuelType.DIESEL, 6, "BMW 3");
		Vehicle vehicle = new Vehicle("car", "BMW", 10, VehicleType.FOURWHEELER, "360 kmph", 42.0, "black", engine);
		//vehicleService.addVehicle(vehicle);
		
		Engine engine1 = new Engine("120 cc", 2.2, FuelType.PETROL, 2, "j11");
		Vehicle vehicle1 = new Vehicle("scooty", "jupiter", 40, VehicleType.TWOWHEELER, "120 kmph", 11.0, "red", engine1);
		//vehicleService.addVehicle(vehicle1);
		
//		Vehicle nvehicle = vehicleService.getById(2);
//		Engine nengine = nvehicle.getEngine();
//		nengine.setSize(3.8);
//		vehicleService.updateVehicle(nvehicle);
		
		System.out.println("View all vehicles");
		vehicleService.getAll().forEach(System.out::println);
		System.out.println();
		
		System.out.println("View vehicles - By color");
		vehicleService.getByColor("black").forEach(System.out::println);
		System.out.println();
		
		System.out.println("View vehicles - By model");
		vehicleService.getByModel("maruti").forEach(System.out::println);
		System.out.println();
		
		System.out.println("View vehicles - By Mileage and top speed");
		vehicleService.getByMileageAndTopSpeed(40, "300 kmph").forEach(System.out::println);
		System.out.println();
		
		System.out.println("View vehicles - By FuelType");
		vehicleService.getByFuelType("PETROL").forEach(System.out::println);
		System.out.println();
		
		System.out.println("View vehicles - By vehicle and fuel type");
		vehicleService.getByVehicleAndFuelType("car", "PETROL").forEach(System.out::println);
		System.out.println();
		
		System.out.println("View vehicles - By vehicle and color");
		vehicleService.getByVehicleAndColor("auto", "yellow").forEach(System.out::println);
		System.out.println();
	}

}
