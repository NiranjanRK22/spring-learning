package com.empapp.service;

import java.util.List;

import com.empapp.model.Employee;

public interface IEmployeeService {
     
	Employee addEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployee(int employeeId);
	
	List<Employee> getAll();
	Employee getById(int employeeId);
	List<Employee> getByCity(String city);
	List<Employee> getByCourseName(String courseName);
}
