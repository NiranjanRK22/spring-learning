package com.sportsapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportsapp.exception.SportNotFoundException;
import com.sportsapp.model.Sports;
import com.sportsapp.model.Type;
import com.sportsapp.repository.ISportsRepository;

@Service
public class SportsServiceImpl implements ISportsService {
    
	private ISportsRepository sportsRepo;
	
	
    @Autowired
	public SportsServiceImpl(ISportsRepository sportsRepo) {
    	super();
		this.sportsRepo = sportsRepo;
	}

	@Override
	public void addSports(Sports sports) {
		sportsRepo.save(sports);

	}

	@Override
	public void updateSports(Sports sports) {
		sportsRepo.save(sports);

	}

	@Override
	public void deleteSports(int sportsId) {
		sportsRepo.deleteById(sportsId);

	}

	@Override
	public Sports getById(int sportsId) throws SportNotFoundException {
		return sportsRepo.findById(sportsId).orElseThrow(()->new SportNotFoundException("id not found"));
	}

	@Override
	public List<Sports> getAll() {
		return sportsRepo.findAll();
	}

	@Override
	public List<Sports> getByNameAndCoachName(String name, String coachName) throws SportNotFoundException {
		List<Sports> sportsList = sportsRepo.findByNameAndCoach(name, coachName);
		return sportsList;
	}

	@Override
	public List<Sports> getBySponsors(String sponsors) throws SportNotFoundException {
		List<Sports> sportsList = sportsRepo.findBySponsors(sponsors);
		return sportsList;
	}

	@Override
	public List<Sports> getByTypeAndName(String type, String name) throws SportNotFoundException {
		List<Sports> sportsList = sportsRepo.findByTypeAndName(Type.valueOf(type), name);
		return sportsList;
	}

	@Override
	public List<Sports> getByPlayerCount(int playerCount) throws SportNotFoundException {
		List<Sports> sportsList = sportsRepo.findByPlayerCount(playerCount);
		return sportsList;
	}

	@Override
	public List<Sports> getByStadiumAndName(String stadium, String name) throws SportNotFoundException {
		List<Sports> sportsList = sportsRepo.findByStadiumAndName(stadium, name);
		return sportsList;
	}

	@Override
	public List<Sports> getByStadiumAndDuration(String stadium, String duration) throws SportNotFoundException {
		List<Sports> sportsList = sportsRepo.findByStadiumAndDuration(stadium, duration);
		return sportsList;
	}

	@Override
	public List<Sports> getBySponsorsAndStadium(String sponsors, String stadium) throws SportNotFoundException {
		List<Sports> sportsList = sportsRepo.findBySponsorsAndStadium(sponsors, stadium);
		return sportsList;
	}

	@Override
	public List<Sports> getByNameAndSponsors(String name, String sponsors) {
		List<Sports> sportsList = sportsRepo.findByNameAndSponsors(name, sponsors);
		return sportsList;
	}

}
