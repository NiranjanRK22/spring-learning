package com.studentapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.studentapp.model.BiAddress;

@Repository
public interface IBiAddressRepository extends JpaRepository<BiAddress, Integer>{
    List<BiAddress> findByCity(String city);
    
    @Query("from BiAddress ba inner join ba.student s where s.name=?1")
    List<BiAddress> findByName(String studentName);
    
    @Query("from BiAddress ba inner join ba.student s where s.department=?1")
    List<BiAddress> findByDepartment(String dept);
    
    @Query("from BiAddress ba inner join ba.student s where s.name=?1 and ba.city=?2")
    List<BiAddress> findByNameAndCity(String studentName, String city);
    
    @Query("from BiAddress ba inner join ba.student s where s.studentId=?1")
    BiAddress findByStudentId(int studentId);
    
    @Query("from BiAddress ba inner join ba.student s where s.name=?1 and ba.streetName=?2")
    List<BiAddress> findByNameAndStreetname(String studentName, String streetName);
}
