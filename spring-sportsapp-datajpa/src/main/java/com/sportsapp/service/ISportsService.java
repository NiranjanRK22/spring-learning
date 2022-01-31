package com.sportsapp.service;

import java.util.List;

import com.sportsapp.exception.SportNotFoundException;
import com.sportsapp.model.Sports;

public interface ISportsService {
      
	void addSports(Sports sports);
	void updateSports(Sports sports);
	void deleteSports(int sportsId);
	
	Sports getById(int sportsId) throws SportNotFoundException;
	
	List<Sports> getAll();
	List<Sports> getByNameAndCoachName(String name, String coachName)  throws SportNotFoundException;
	List<Sports> getBySponsors(String sponsors) throws SportNotFoundException;
	List<Sports> getByTypeAndName(String type, String name) throws SportNotFoundException;
	List<Sports> getByPlayerCount(int playerCount) 	throws SportNotFoundException;
	List<Sports> getByStadiumAndName(String stadium, String name) throws SportNotFoundException;
	List<Sports> getByStadiumAndDuration(String stadium, String duration) throws SportNotFoundException;
	
	List<Sports> getBySponsorsAndStadium(String sponsors, String stadium) throws SportNotFoundException;
	List<Sports> getByNameAndSponsors(String name, String sponsors);
}
