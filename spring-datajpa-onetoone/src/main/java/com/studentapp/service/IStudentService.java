package com.studentapp.service;

import java.util.List;

import com.studentapp.model.Student;

public interface IStudentService {
      Student addStudent(Student student);
      void updateStudent(Student student);
      void deleteStudent(int studentId);
      
      Student getById(int studentId);
      List<Student> getAll();
      
      List<Student> getByDepartment(String department);
      List<Student> getByCity(String city);
      List<Student> getByDeptAndCity(String dept, String city);
      List<Student> getByState(String state);
}
