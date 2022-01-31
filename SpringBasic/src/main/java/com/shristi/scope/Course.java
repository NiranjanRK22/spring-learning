package com.shristi.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties") //to recognise application.properties file
@Scope("prototype")
public class Course {
     private String name;
     private double cost;
     private int duration;
     private Trainer trainer;
     
	public String getName() {
		return name;
	}
	@Value("${course.name}")
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	
	@Value("${course.cost}")
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getDuration() {
		return duration;
	}
	@Value("${course.duration}")
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	@Autowired
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", cost=" + cost + ", duration=" + duration + ", trainer=" + trainer + "]";
	}
     
     
}
