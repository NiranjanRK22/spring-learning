package com.vehicleapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vehicleapp.model.FuelType;
import com.vehicleapp.model.Vehicle;

@Repository
public interface IVehicleRepository extends JpaRepository<Vehicle, Integer>{
      
	List<Vehicle> findByColor(String color);
	
	@Query("from Vehicle v inner join v.engine e where v.model like %?1%")
	List<Vehicle> findByModel(String model);
	
	@Query("from Vehicle v inner join v.engine e where v.mileage<?1 and v.topSpeed=?2")
	List<Vehicle> findByMileageAndSpeed(int mileage, String topSpeed);
	
	@Query("from Vehicle v inner join v.engine e where e.fuelType=?1")
	List<Vehicle> findByFuelType(FuelType fuelType);
	
	@Query("from Vehicle v inner join v.engine e where v.vehicleName=?1 and e.fuelType=?2")
	List<Vehicle> findByVehicleFuelType(String vehicleName, FuelType fuelType);
	
	@Query("from Vehicle v inner join v.engine e where v.vehicleName=?1 and v.color=?2")
	List<Vehicle> findByVehicleColor(String vehicleName, String color);
}
