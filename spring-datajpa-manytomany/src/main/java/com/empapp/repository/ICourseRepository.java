package com.empapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.empapp.model.Course;

public interface ICourseRepository extends JpaRepository<Course, Integer>{
	
	@Query("from Course c inner join c.employeeList e where e.name=?1")
	List<Course> findByEmployee(String name);
	
    List<Course> findByFeesLessThan(double fees);
    
    @Query("from Course c inner join c.employeeList e where e.city=?1")
    List<Course> findByCity(String city);
}
