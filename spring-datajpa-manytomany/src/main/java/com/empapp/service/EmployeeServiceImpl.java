package com.empapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empapp.model.Employee;
import com.empapp.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    
	private IEmployeeRepository employeeRepo;
	
	
	/**
	 * @param employeeRepo the employeeRepo to set
	 */
	@Autowired
	public void setEmployeeRepo(IEmployeeRepository employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepo.save(employee);

	}

	@Override
	public void deleteEmployee(int employeeId) {
		employeeRepo.deleteById(employeeId);

	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public Employee getById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(employeeId).get();
	}

	@Override
	public List<Employee> getByCity(String city) {
		// TODO Auto-generated method stub
		return employeeRepo.findByCity(city);
	}

	@Override
	public List<Employee> getByCourseName(String courseName) {
		// TODO Auto-generated method stub
		return employeeRepo.findByCourseName(courseName);
	}

}
