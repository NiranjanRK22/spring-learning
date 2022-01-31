package com.vehicleapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleapp.exception.VehicleNotFoundException;
import com.vehicleapp.model.FuelType;
import com.vehicleapp.model.Vehicle;
import com.vehicleapp.repository.IVehicleRepository;

@Service
public class VehicleServiceImpl implements IVehicleService {
	
	private IVehicleRepository vehicleRepository;

	/**
	 * @param vehicleRepository the vehicleRepository to set
	 */
	@Autowired
	public void setVehicleRepository(IVehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}

	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return vehicleRepository.save(vehicle);
	}

	@Override
	public void updateVehicle(Vehicle vehicle) {
		vehicleRepository.save(vehicle);
	}

	@Override
	public void deleteVehicle(int vehicleId) {
		vehicleRepository.deleteById(vehicleId);
	}

	@Override
	public Vehicle getById(int vehicleId) throws VehicleNotFoundException {
		// TODO Auto-generated method stub
		return vehicleRepository.findById(vehicleId).get();
	}

	@Override
	public List<Vehicle> getAll() {
		return vehicleRepository.findAll();
	}

	@Override
	public List<Vehicle> getByColor(String color) throws VehicleNotFoundException {
		return vehicleRepository.findByColor(color);
	}

	@Override
	public List<Vehicle> getByModel(String model) throws VehicleNotFoundException {
		return vehicleRepository.findByModel(model);
	}

	@Override
	public List<Vehicle> getByMileageAndTopSpeed(int mileage, String topSpeed) throws VehicleNotFoundException {
		return vehicleRepository.findByMileageAndSpeed(mileage, topSpeed);
	}

	@Override
	public List<Vehicle> getByFuelType(String fuelType) throws VehicleNotFoundException {
		return vehicleRepository.findByFuelType(FuelType.valueOf(fuelType));
	}

	@Override
	public List<Vehicle> getByVehicleAndFuelType(String vehicleName, String fuelType) throws VehicleNotFoundException {
		return vehicleRepository.findByVehicleFuelType(vehicleName, FuelType.valueOf(fuelType));
	}

	@Override
	public List<Vehicle> getByVehicleAndColor(String vehicleName, String color) throws VehicleNotFoundException {
		// TODO Auto-generated method stub
		return vehicleRepository.findByVehicleColor(vehicleName, color);
	}

	
	
}
