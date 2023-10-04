package com.codsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.codsoft.exception.GameNotFoundException;
import com.codsoft.model.Game;

public class GameServiceImpl implements GameService {
	
	@Autowired
	private Game game;

	@Override
	public List<Game> retriveAllGames(Integer userId) throws GameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Game retriveGame(Integer gameId) throws GameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
