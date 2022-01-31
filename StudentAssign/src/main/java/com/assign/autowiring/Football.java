package com.assign.autowiring;

import org.springframework.stereotype.Component;

@Component("footballSport")
public class Football implements Sports{

	@Override
	public void showLeagueDetails() {
		
		System.out.println("football league");
	}

}
