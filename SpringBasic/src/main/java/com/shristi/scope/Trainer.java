package com.shristi.scope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Trainer {
    private String name;
    private int experience;
    
	public String getName() {
		return name;
	}
	@Value("${course.trainer.name}")
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	@Value("${course.trainer.experience}")
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Trainer [name=" + name + ", experience=" + experience + "]";
	}
    
	
    
}
