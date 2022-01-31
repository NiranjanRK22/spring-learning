package com.assign.autowiring;

import org.springframework.stereotype.Component;

@Component
public class Cricket implements Sports{

	@Override
	public void showLeagueDetails() {
		System.out.println("cricket league");
		
	}

}
