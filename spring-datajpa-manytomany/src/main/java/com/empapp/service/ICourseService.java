package com.empapp.service;

import java.util.List;

import com.empapp.model.Course;

public interface ICourseService {
    Course addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourse(int courseId);
    List<Course> getAll();
    
    Course getById(int courseId);
    List<Course> getByEmployee(String name);
    List<Course> getByLesserFees(double fees);
    List<Course> getByCity(String city);
}
