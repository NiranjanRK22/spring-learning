package com.shristi.autojavabased;


public class Square implements Shape {

	@Override
	public void calcArea(int x, int y) {

		System.out.println("square " + x*2);
	}

}
