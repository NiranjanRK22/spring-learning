package com.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.model.BiAddress;
import com.studentapp.repository.IBiAddressRepository;

@Service
public class BiAddressServiceImpl implements IBiAddressService {
	
	
	IBiAddressRepository addressRepository;
	
	/**
	 * @param addressRepository the addressRepository to set
	 */
	@Autowired
	public void setAddressRepository(IBiAddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}

	@Override
	public List<BiAddress> getByName(String studentName) {
		// TODO Auto-generated method stub
		return addressRepository.findByName(studentName);
	}

	@Override
	public List<BiAddress> getByDepartment(String dept) {
		// TODO Auto-generated method stub
		return addressRepository.findByDepartment(dept);
	}

	@Override
	public BiAddress getByStudentId(int studentId) {
		// TODO Auto-generated method stub
		return addressRepository.findByStudentId(studentId);
	}

	@Override
	public List<BiAddress> getByNameAndCity(String studentName, String city) {
		// TODO Auto-generated method stub
		return addressRepository.findByNameAndCity(studentName, city);
	}

	@Override
	public List<BiAddress> getByNameAndStreetname(String studentName, String streetName) {
		// TODO Auto-generated method stub
		return addressRepository.findByNameAndStreetname(studentName, streetName);
	}

	@Override
	public List<BiAddress> getByCity(String city) {
		// TODO Auto-generated method stub
		return addressRepository.findByCity(city);
	}

}
