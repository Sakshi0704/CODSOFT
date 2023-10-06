package com.codsoft.service;

import java.util.List;

import com.codsoft.dto.GameDTO;
import com.codsoft.exception.GameNotFoundException;
import com.codsoft.model.Game;

public interface GameService {

	public List<GameDTO> retriveAllGamesWithUser() throws GameNotFoundException;
	
	public List<Game> retriveAllGamesUserId(Integer userId) throws GameNotFoundException;
	
	public Game retriveGameByGameId(Integer gameId) throws GameNotFoundException;
	
	public Game deleteGameByGameId(Integer gameId) throws GameNotFoundException;
	
}
