package com.rentalapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rentalapp.model.RentalProperty;

@Repository
public interface IRentalPropertyRepository extends JpaRepository<RentalProperty,Integer> {
	
	//Derived Queries
     List<RentalProperty> findByCategory(String category);
     List<RentalProperty> findByType(String type);
     List<RentalProperty> findByLocation(String location);
     List<RentalProperty> findByCity(String city);
     List<RentalProperty> findBySecurityDepositLessThan(double securityDeposit);
     List<RentalProperty> findByRentExpectedBetween(double start, double end);
     
     
     //custom query - JPQL
     @Query("from RentalProperty rp where rp.category=?1")
     List<RentalProperty> findByCat(String cat);
     @Query("from RentalProperty rp where rp.category=?1 and rp.city=?2")
     List<RentalProperty> findByCatCity(String cat, String city);
     
     @Query("from RentalProperty rp where rp.securityDeposit<?1")
     List<RentalProperty> findByDeposit(double securitydeposit);
     
     @Query("from RentalProperty rp where rp.rentExpected between ?1 and ?2")
     List<RentalProperty> findByExpectedRent(double start, double end);

     //named query
     @Query(name="findByCatType")
     List<RentalProperty> findByCatAndType(String category, String type);
     
     //native query
     @Query(value="select * from rentalproperty where type=?1 and rentexpected<?2", nativeQuery= true)
     List<RentalProperty> findByTypeAndRent(String type, double rent);
     
     @Query(value="update rentalproperty set rentexpected=?2 where propertyid=?1", nativeQuery=true)
     @Modifying
     void updateProperty(int propertyId, double rent);
}
