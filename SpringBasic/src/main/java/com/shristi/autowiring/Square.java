package com.shristi.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape {

	@Override
	public void calcArea(int x, int y) {

		System.out.println("square " + x*2);
	}

}
