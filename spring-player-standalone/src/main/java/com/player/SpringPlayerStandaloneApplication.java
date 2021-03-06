package com.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.player.exception.PlayerNotFoundException;
import com.player.service.IPlayerService;

@SpringBootApplication
public class SpringPlayerStandaloneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringPlayerStandaloneApplication.class, args);
	}
	
	@Autowired
	IPlayerService playerService;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("All players");
		playerService.getAllPlayers().forEach(System.out::println);
		try {
			System.out.println("Players by sport");
			playerService.getBySport("cricket").forEach(System.out::println);
		}
		catch(PlayerNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("players by many matches played");
		playerService.getByManyMatchesPlayed(200).forEach(System.out::println);
		
		System.out.println("players by played national or not");
		playerService.getByPlayedNational(false).forEach(System.out::println);
		
	}

}
