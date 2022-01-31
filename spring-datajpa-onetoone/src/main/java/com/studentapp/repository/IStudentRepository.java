package com.studentapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.studentapp.model.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer>{
    
	List<Student> findByDepartment(String department);
	
	List<Student> findByAddressCity(String city);
	
	//custom queries
	//select * from student s inner join address a on s.addressid = a.addressid where a.state=?1
	@Query("from Student s inner join s.address a where a.state=?1")
	List<Student> findByState(String state);
	
	//select * from student s inner join address a on s.addressid = a.addressid where s.department=?1 and a.city=?2
	@Query("from Student s inner join s.address a where s.department=?1 and a.city=?2")
	List<Student> findByDeptAndCity(String dept, String city);
}
