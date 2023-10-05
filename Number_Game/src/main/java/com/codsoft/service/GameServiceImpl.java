package com.codsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codsoft.exception.GameNotFoundException;
import com.codsoft.model.Game;
import com.codsoft.repository.GameRepository;

@Service
public class GameServiceImpl implements GameService {
	
	@Autowired
	private GameRepository gameRepo;

	@Override
	public List<Game> retriveAllGames(Integer userId) throws GameNotFoundException {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public Game retriveGame(Integer gameId) throws GameNotFoundException {
		
		
		return null;
	}

}
