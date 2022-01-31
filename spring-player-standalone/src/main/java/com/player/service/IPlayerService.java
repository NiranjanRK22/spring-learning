package com.player.service;

import java.util.List;

import com.player.exception.PlayerNotFoundException;
import com.player.model.Player;

public interface IPlayerService {
      
	List<Player> getAllPlayers();
	List<Player> getBySport(String sport) throws PlayerNotFoundException;
	List<Player> getByManyMatchesPlayed(int matchesPlayed) throws PlayerNotFoundException;
	List<Player> getByPlayedNational(boolean playedNational) throws PlayerNotFoundException;
	
	Player getById(int playerId) throws PlayerNotFoundException;
	
}
