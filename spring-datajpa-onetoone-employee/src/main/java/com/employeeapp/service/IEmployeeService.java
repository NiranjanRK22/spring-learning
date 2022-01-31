package com.employeeapp.service;

import java.util.List;

import com.employeeapp.exception.EmployeeNotFoundException;
import com.employeeapp.model.Employee;

public interface IEmployeeService {
      Employee addEmployee(Employee employee);
      void updateEmployee(Employee employee);
      void deleteEmployee(int employeeId);
      
      Employee getById(int employeeId);
      List<Employee> getAll();
      List<Employee> getBySalary() throws EmployeeNotFoundException;
      List<Employee> getByBloodGroup() throws EmployeeNotFoundException;
      List<Employee> getByRole() throws EmployeeNotFoundException;
      
}
