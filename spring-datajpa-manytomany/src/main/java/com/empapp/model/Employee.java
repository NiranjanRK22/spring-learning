package com.empapp.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {
	@Id
    @Column(name="employeeid")
    @GeneratedValue(generator="emp_seq", strategy=GenerationType.AUTO) 
    @SequenceGenerator(name="emp_seq", sequenceName="emp_sequence", initialValue=1, allocationSize=1)
    private Integer employeeId;
	@Column(length=20)
    private String name;
	@Column(length=20)
    private String city;
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="employee_course",
         joinColumns = @JoinColumn(name="employeeid"),
         inverseJoinColumns = @JoinColumn(name="courseid")
    		)
    private Set<Course> courseList;
	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param city
	 */
	public Employee(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	/**
	 * @return the employeeId
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
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
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the courseList
	 */
	public Set<Course> getCourseList() {
		return courseList;
	}
	/**
	 * @param courseList the courseList to set
	 */
	public void setCourseList(Set<Course> courseList) {
		this.courseList = courseList;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", city=" + city + ", courseList=" + courseList
				+ "]";
	}
    
    
}
