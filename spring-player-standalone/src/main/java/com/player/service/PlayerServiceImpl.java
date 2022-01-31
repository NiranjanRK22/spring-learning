package com.player.service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.player.exception.PlayerNotFoundException;
import com.player.model.Player;

@Service
public class PlayerServiceImpl implements IPlayerService {

	@Override
	public List<Player> getAllPlayers() {
		return showPlayersList().stream().sorted(Comparator.comparing(Player::getSport)).collect(Collectors.toList());
	}

	@Override
	public List<Player> getBySport(String sport) throws PlayerNotFoundException {
		List<Player> playersBySport = showPlayersList().stream().filter(player -> player.getSport().equals(sport))
				.sorted(Comparator.comparing(Player::getCity)).collect(Collectors.toList());
		if (playersBySport.isEmpty()) {
			throw new PlayerNotFoundException("sport not found");
		} 
		return playersBySport;
	}

	@Override
	public List<Player> getByManyMatchesPlayed(int matchesPlayed) throws PlayerNotFoundException {
		List<Player> playersByMatchesPlayed = showPlayersList().stream()
				.filter(player -> player.getMatchesPlayed() > matchesPlayed)
				.sorted(Comparator.comparing(Player::getMatchesPlayed).reversed()).collect(Collectors.toList());
		if (playersByMatchesPlayed.isEmpty()) {
			throw new PlayerNotFoundException("player not found");
		}
		return playersByMatchesPlayed;
	}

	@Override
	public List<Player> getByPlayedNational(boolean playedNational) throws PlayerNotFoundException {
		List<Player> playersByPlayedNational = showPlayersList().stream()
				.filter(player -> player.isPlayedNational() == playedNational)
				.sorted(Comparator.comparing(Player::getName).reversed()).collect(Collectors.toList());
		if (playersByPlayedNational.isEmpty()) {
			throw new PlayerNotFoundException("player not found");
		} 
		return playersByPlayedNational;
	}

	@Override
	public Player getById(int playerId) throws PlayerNotFoundException {
		return showPlayersList().stream().filter(player -> player.getPlayerId() == playerId).findAny()
				.orElseThrow(() -> new PlayerNotFoundException("id not found"));
	}

	private List<Player> showPlayersList() {
		return Arrays.asList(new Player(1, "virat", "cricket", "delhi", 28, true, 250),
				new Player(2, "ronaldo", "football", "mumbai", 32, true, 120),
				new Player(3, "niranjan", "cricket", "hyderabad", 23, false, 30),
				new Player(4, "sindhu", "badminton", "hyderabad", 27, true, 400),
				new Player(5, "warner", "cricket", "aus", 34, true, 150));
	}

}
