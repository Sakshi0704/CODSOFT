package com.codsoft.service;

import java.util.List;

import com.codsoft.exception.GameNotFoundException;
import com.codsoft.model.Game;

public interface GameService {

	public List<Game> retriveAllGames(Integer userId) throws GameNotFoundException;
	
	public Game retriveGame(Integer gameId) throws GameNotFoundException;
	
}
