package com.empapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.empapp.model.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer>{
     
	List<Employee> findByCity(String city);
	@Query("from Employee e inner join e.courseList c where c.courseName=?1")
	List<Employee> findByCourseName(String courseName);
}
