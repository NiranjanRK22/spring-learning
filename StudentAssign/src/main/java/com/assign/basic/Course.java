package com.assign.basic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
     private String courseName;
     private double cost;
     private int duration;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param courseName
	 * @param cost
	 * @param duration
	 */
	public Course(String courseName, double cost, int duration) {
		super();
		this.courseName = courseName;
		this.cost = cost;
		this.duration = duration;
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
	@Value("spring")
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	@Value("3000.0")
	public void setCost(double cost) {
		this.cost = cost;
	}
	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	@Value("2")
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", cost=" + cost + ", duration=" + duration + "]";
	}
     
     
}
