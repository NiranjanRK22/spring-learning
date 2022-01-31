package com.rentalapp.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rentalapp.exception.PropertyNotFoundException;
import com.rentalapp.model.RentalProperty;
import com.rentalapp.repository.IRentalPropertyRepository;

@Service
public class RentalPropertyServiceImpl implements IRentalPropertyService{
    
	private IRentalPropertyRepository rentalPropertyRepo;
	
	
	@Autowired
	public RentalPropertyServiceImpl(IRentalPropertyRepository rentalPropertyRepo) {
		super();
		this.rentalPropertyRepo = rentalPropertyRepo;
	}


	@Override
	public void addRentalProperty(RentalProperty rentalProperty) {
		rentalPropertyRepo.save(rentalProperty);
		
	}
	
	@Override
	public void updateRentalProperty(RentalProperty rentalProperty) {
		rentalPropertyRepo.save(rentalProperty);
		
	}

    /**
     * 
     */
	@Override
	public void deleteRentalProperty(int propertyId) {
		rentalPropertyRepo.deleteById(propertyId);
		
	}

    /**
     * 
     */
	@Override
	public RentalProperty getById(int propertyId) throws PropertyNotFoundException {
//		Optional<RentalProperty> propertyOpt = rentalPropertyRepo.findById(propertyId);
//		if (propertyOpt.isEmpty())
//			throw new PropertyNotFoundException();
//		return propertyOpt.get();
		return rentalPropertyRepo
		.findById(propertyId)
		.orElseThrow(()->new PropertyNotFoundException("invalid id"));
		
	}


	@Override
	public List<RentalProperty> getByCategory(String category) throws PropertyNotFoundException {
        List<RentalProperty> propertyList = rentalPropertyRepo.findByCategory(category);
        if(propertyList.isEmpty())
        	throw new PropertyNotFoundException("category not found");
		return propertyList;
	}


	@Override
	public List<RentalProperty> getByType(String type) throws PropertyNotFoundException {
		List<RentalProperty> propertyList = rentalPropertyRepo.findByType(type);
		if(propertyList.isEmpty())
        	throw new PropertyNotFoundException("type not found");
		return propertyList;
	}


	@Override
	public List<RentalProperty> getByRentRange(double start, double end) throws PropertyNotFoundException {
		//List<RentalProperty> propertyList = rentalPropertyRepo.findByRentExpectedBetween(start, end);
		List<RentalProperty> propertyList = rentalPropertyRepo.findByExpectedRent(start, end);
		if(propertyList.isEmpty())
        	throw new PropertyNotFoundException("property not found in given rent range");
		return propertyList;
	}


	@Override
	public List<RentalProperty> getByLesserDeposit(double deposit) throws PropertyNotFoundException {
		//List<RentalProperty> propertyList = rentalPropertyRepo.findBySecurityDepositLessThan(deposit);
		List<RentalProperty> propertyList = rentalPropertyRepo.findByDeposit(deposit);
		if(propertyList.isEmpty())
        	throw new PropertyNotFoundException("property not found with lesser deposit");
		return propertyList;
	}


	@Override
	public List<RentalProperty> getByLocation(String location) throws PropertyNotFoundException {
		List<RentalProperty> propertyList = rentalPropertyRepo.findByLocation(location);
		if(propertyList.isEmpty())
        	throw new PropertyNotFoundException("property not found in this location");
		return propertyList;
	}


	@Override
	public List<RentalProperty> getByCity(String city) throws PropertyNotFoundException {
		List<RentalProperty> propertyList = rentalPropertyRepo.findByCity(city);
		if(propertyList.isEmpty())
        	throw new PropertyNotFoundException("property not found in this city");
		return propertyList;
	}


	@Override
	public List<RentalProperty> getAll() {
		//Sort sort = Sort.by(Sort.Direction.DESC);
		return rentalPropertyRepo.findAll();
	}


	@Override
	public List<RentalProperty> findByCatAndCity(String category, String city) {
		List<RentalProperty> propertyList = rentalPropertyRepo.findByCatCity(category, city);
		if(propertyList.isEmpty())
        	throw new PropertyNotFoundException("property not found in this city with this category");
		return propertyList;
	}


	@Override
	public List<RentalProperty> findByCatAndType(String category, String type) {
		List<RentalProperty> propertyList = rentalPropertyRepo.findByCatAndType(category, type);
		if(propertyList.isEmpty())
        	throw new PropertyNotFoundException("property not found with this category and type");
		return propertyList;
	}


	@Override
	public List<RentalProperty> findByTypeAndRent(String type, double rent) {
		List<RentalProperty> propertyList = rentalPropertyRepo.findByTypeAndRent(type, rent);
		if(propertyList.isEmpty())
        	throw new PropertyNotFoundException("property not found with this rent and type");
		return propertyList;
	}


	@Override
	@Transactional
	public void updateProperty(int propertyId, double rent) {
		rentalPropertyRepo.updateProperty(propertyId, rent);
	}

	

}
