package com.sportsapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sportsapp.model.Sports;
import com.sportsapp.model.Type;
import com.sportsapp.service.ISportsService;

@SpringBootApplication
public class SpringSportsappDatajpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringSportsappDatajpaApplication.class, args);
	}
    
	@Autowired
	ISportsService sportsService;
	@Override
	public void run(String... args) throws Exception {
		Sports sports = new Sports("carroms", 4, "ajay", Type.INDOOR, "1 hr", "acheron", "home", "warangal");
		//sportsService.addSports(sports);
		
		//sportsService.deleteSports(111);
		
		System.out.println("show all data");
		sportsService.getAll().forEach(System.out::println);
		System.out.println();
		
		System.out.println("sports by sponsors");
		sportsService.getBySponsors("acheron").forEach(System.out::println);
		System.out.println();
		
		System.out.println("sports by name and coach");
		sportsService.getByNameAndCoachName("cricket", "rahul").forEach(System.out::println);
		System.out.println();
		
		System.out.println("sports by type and name");
		sportsService.getByTypeAndName("OUTDOOR", "cricket").forEach(System.out::println);
		System.out.println();
		
		System.out.println("sports by players count");
		sportsService.getByPlayerCount(11).forEach(System.out::println);
		System.out.println();
		
		System.out.println("sports by stadium and name");
		sportsService.getByStadiumAndName("rajiv gandhi", "cricket").forEach(System.out::println);
		System.out.println();
		
		System.out.println("sports by stadium and duration");
		sportsService.getByStadiumAndDuration("rajiv gandhi", "3 hr").forEach(System.out::println);
		System.out.println();
		
		System.out.println("sports by sponsors and stadium");
		sportsService.getBySponsorsAndStadium("acheron", "wankhede").forEach(System.out::println);
		System.out.println();
		
		System.out.println("sports by name and sponsors");
		sportsService.getByNameAndSponsors("cricket", "shristi").forEach(System.out::println);
	}

}
