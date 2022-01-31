package com.assign.autowiring;

import org.springframework.stereotype.Component;

@Component
public class BasketBall implements Sports{

	@Override
	public void showLeagueDetails() {
		System.out.println("Basketball league");
		
	}

}
