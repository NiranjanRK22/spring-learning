package com.shristi.autowiring;

import org.springframework.stereotype.Component;

import com.shristi.autowiring.Shape;

@Component("rshape")
public class Rectangle implements Shape {

	@Override
	public void calcArea(int x, int y) {
		System.out.println(x*y);
	}

}
