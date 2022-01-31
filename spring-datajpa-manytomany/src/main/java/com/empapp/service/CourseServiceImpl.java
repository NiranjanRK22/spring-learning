package com.empapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empapp.model.Course;
import com.empapp.repository.ICourseRepository;

@Service
public class CourseServiceImpl implements ICourseService {
    
	private ICourseRepository courseRepo;
	
	
	/**
	 * @param courseRepo the courseRepo to set
	 */
	@Autowired
	public void setCourseRepo(ICourseRepository courseRepo) {
		this.courseRepo = courseRepo;
	}

	@Override
	public Course addCourse(Course course) {
		return courseRepo.save(course);

	}

	@Override
	public void updateCourse(Course course) {
		courseRepo.save(course);

	}

	@Override
	public void deleteCourse(int courseId) {
		courseRepo.deleteById(courseId);

	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return courseRepo.findAll();
	}

	@Override
	public Course getById(int courseId) {
		// TODO Auto-generated method stub
		return courseRepo.findById(courseId).get();
	}

	@Override
	public List<Course> getByEmployee(String name) {
		// TODO Auto-generated method stub
		return courseRepo.findByEmployee(name);
	}

	@Override
	public List<Course> getByLesserFees(double fees) {
		// TODO Auto-generated method stub
		return courseRepo.findByFeesLessThan(fees);
	}

	@Override
	public List<Course> getByCity(String city) {
		
		return courseRepo.findByCity(city);
	}

}
