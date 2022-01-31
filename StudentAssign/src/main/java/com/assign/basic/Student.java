package com.assign.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
     private String name;
     private String department;
     @Autowired
     private Course course;
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param department
	 * @param course
	 */
	public Student(String name, String department, Course course) {
		super();
		this.name = name;
		this.department = department;
		this.course = course;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	@Value("Niranjan")
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	@Value("ECE")
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", department=" + department + ", course=" + course + "]";
	}
     
     
}
