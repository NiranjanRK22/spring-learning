package com.empapp.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Course {
	@Id
    @Column(name="courseid")
    @GeneratedValue(generator="course_seq", strategy=GenerationType.AUTO) 
    @SequenceGenerator(name="course_seq", sequenceName="course_sequence", initialValue=1, allocationSize=1)
    private Integer courseId;
	@Column(name="coursename", length=20)
    private String courseName;
	@Column(length=10)
    private String duration;
    private double fees;
    @ManyToMany(fetch=FetchType.EAGER, mappedBy="courseList")
    private Set<Employee> employeeList;
	/**
	 * 
	 */
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String courseName, String duration, double fees) {
		super();
		this.courseName = courseName;
		this.duration = duration;
		this.fees = fees;
	}
	/**
	 * @return the courseId
	 */
	public Integer getCourseId() {
		return courseId;
	}
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}
	/**
	 * @return the fees
	 */
	public double getFees() {
		return fees;
	}
	/**
	 * @param fees the fees to set
	 */
	public void setFees(double fees) {
		this.fees = fees;
	}
	/**
	 * @return the employeeList
	 */
	public Set<Employee> getEmployeeList() {
		return employeeList;
	}
	/**
	 * @param employeeList the employeeList to set
	 */
	public void setEmployeeList(Set<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", duration=" + duration + ", fees=" + fees + "]";
	}
    
    
}
