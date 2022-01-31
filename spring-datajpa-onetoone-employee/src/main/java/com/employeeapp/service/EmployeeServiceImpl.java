package com.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.exception.EmployeeNotFoundException;
import com.employeeapp.model.Employee;
import com.employeeapp.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    
	private IEmployeeRepository employeeRepository;
	
	/**
	 * @param employeeRepository the employeeRepository to set
	 */
	@Autowired
	public void setEmployeeRepository(IEmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}

	@Override
	public void deleteEmployee(int employeeId) {
		employeeRepository.deleteById(employeeId);	
	}

	@Override
	public Employee getById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getBySalary() throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getByBloodGroup() throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getByRole() throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
