package com.studentapp.service;

import java.util.List;

import com.studentapp.model.BiStudent;

public interface IBiStudentService {
      BiStudent addBiStudent(BiStudent BiStudent);
      void updateBiStudent(BiStudent BiStudent);
      void deleteBiStudent(int studentId);
      
      BiStudent getById(int studentId);
      List<BiStudent> getAll();
      
      List<BiStudent> getByDepartment(String department);
      List<BiStudent> getByCity(String city);
      List<BiStudent> getByDeptAndCity(String dept, String city);
      List<BiStudent> getByState(String state);
}
