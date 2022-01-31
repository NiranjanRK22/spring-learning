package com.studentapp.service;

import java.util.List;

import com.studentapp.model.BiAddress;

public interface IBiAddressService {
      
	List<BiAddress> getByName(String studentName);
	List<BiAddress> getByDepartment(String dept);
	BiAddress getByStudentId(int studentId);
	List<BiAddress> getByNameAndCity(String studentName, String city);
	
	List<BiAddress> getByNameAndStreetname(String studentName, String streetName);
	List<BiAddress> getByCity(String city);
}
