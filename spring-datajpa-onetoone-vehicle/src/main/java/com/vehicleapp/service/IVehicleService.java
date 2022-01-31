package com.vehicleapp.service;

import java.util.List;

import com.vehicleapp.exception.VehicleNotFoundException;
import com.vehicleapp.model.Vehicle;

public interface IVehicleService {
     Vehicle addVehicle(Vehicle vehicle);
     void updateVehicle(Vehicle vehicle);
     void deleteVehicle(int vehicleId);
     
     Vehicle getById(int vehicleId) throws VehicleNotFoundException;
     List<Vehicle> getAll();
     
     List<Vehicle> getByColor(String color) throws VehicleNotFoundException;
     List<Vehicle> getByModel(String model) throws VehicleNotFoundException;
     List<Vehicle> getByMileageAndTopSpeed(int mileage, String topSpeed) throws VehicleNotFoundException;
     List<Vehicle> getByFuelType(String fuelType) throws VehicleNotFoundException;
     List<Vehicle> getByVehicleAndFuelType(String vehicleName, String fuelType) throws VehicleNotFoundException;
     List<Vehicle> getByVehicleAndColor(String vehicleName, String color) throws VehicleNotFoundException;
}
