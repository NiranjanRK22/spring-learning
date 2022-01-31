package com.shristi.autojavabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
   
	@Bean
	public Shape getRectangle()  {
		return new Rectangle();
	}
	
	@Bean
	public Shape getTriangle()  {
		return new Triangle();
	}
	
	@Bean
	@Primary  //has the highest priority
	public Shape getSquare()  {
		return new Square();
	}
	
	@Bean
	public ShapeFactory factory()  {
		return new ShapeFactory();
	}
}
