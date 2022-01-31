package com.studentapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.model.BiStudent;
import com.studentapp.repository.IBiStudentRepository;



@Service
public class IBiStudentServiceImpl implements IBiStudentService {
    
    private IBiStudentRepository studentRepository;
	
	@Autowired
	public void setStudentRepository(IBiStudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	@Override
	public BiStudent addBiStudent(BiStudent biStudent) {
		// TODO Auto-generated method stub
		return studentRepository.save(biStudent);
	}

	@Override
	public void updateBiStudent(BiStudent biStudent) {
		
		studentRepository.save(biStudent);
	}

	@Override
	public void deleteBiStudent(int studentId) {
		studentRepository.deleteById(studentId);
		
	}

	@Override
	public BiStudent getById(int studentId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentId).get();
	}

	@Override
	public List<BiStudent> getAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public List<BiStudent> getByDepartment(String department) {
		// TODO Auto-generated method stub
		return studentRepository.findByDepartment(department);
	}

	@Override
	public List<BiStudent> getByCity(String city) {
		// TODO Auto-generated method stub
		return studentRepository.findByAddressCity(city);
	}

	@Override
	public List<BiStudent> getByDeptAndCity(String dept, String city) {
		// TODO Auto-generated method stub
		return studentRepository.findByDeptAndCity(dept, city);
	}

	@Override
	public List<BiStudent> getByState(String state) {
		// TODO Auto-generated method stub
		return studentRepository.findByState(state);
	}
	
	

}
