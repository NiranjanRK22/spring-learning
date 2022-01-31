package com.sportsapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sportsapp.model.Sports;
import com.sportsapp.model.Type;

@Repository
public interface ISportsRepository extends JpaRepository<Sports, Integer>{
    
	@Query("from Sports s where s.sponsors=?1")
	List<Sports> findBySponsors(String sponsors);
	
	@Query("from Sports s where s.name=?1 and s.coachName=?2")
	List<Sports> findByNameAndCoach(String name, String coachName);
	
	@Query("from Sports s where s.type=?1 and s.name=?2")
	List<Sports> findByTypeAndName(Type type, String name);
	
	@Query("from Sports s where s.playerCount=?1")
	List<Sports> findByPlayerCount(int playerCount);
	
	@Query("from Sports s where s.stadium=?1 and s.name=?2")
	List<Sports> findByStadiumAndName(String stadium, String name);
	
	@Query("from Sports s where s.stadium=?1 and s.duration=?2")
	List<Sports> findByStadiumAndDuration(String stadium, String duration);
	
	//named query
	@Query(name="findBySponsorsStadium")
	List<Sports> findBySponsorsAndStadium(String sponsors, String stadium);
	
	//native query
	@Query(value="select * from teamsports where name=?1 and sponsors=?2", nativeQuery= true)
	List<Sports> findByNameAndSponsors(String name, String sponsors);
}
