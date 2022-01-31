package com.assign.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class League {
	
	@Autowired
	@Qualifier("cricket")   //Autowiring by type
    private Sports sports;
    
	@Autowired
    private Sports footballSport;  //Autowiring by name
    
	@Autowired
	@Qualifier("basketBall")  //Autowiring by type
    private Sports basketballSport;
    
    public void printLeague(String sport)  {
    	if (sport.equals("cricket"))  {
    		sports.showLeagueDetails();
    	}
    	if (sport.equals("basketball"))  {
    		basketballSport.showLeagueDetails();
    	}
    	if (sport.equals("football"))  {
    		footballSport.showLeagueDetails();
    	}
    }
}
