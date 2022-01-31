package com.shristi.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	@Autowired
	@Qualifier("square")
	 Shape shape;
    
	@Autowired
	@Qualifier("triangle")
	Shape tshape;
	
	@Autowired
	Shape rshape;
	
	
	public void printShape(String s, int x, int y)  {
		System.out.println("print area");
		if (s.equals("rectangle"))  {
			rshape.calcArea(x, y);
		}
		if (s.equals("square")) {
			shape.calcArea(x, y);
		}
		if (s.equals("triangle"))  {
			tshape.calcArea(x, y);
		}
		
		
	}
}
