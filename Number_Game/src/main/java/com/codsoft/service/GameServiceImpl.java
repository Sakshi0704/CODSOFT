package com.codsoft.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codsoft.dto.GameDTO;
import com.codsoft.exception.GameNotFoundException;
import com.codsoft.exception.UsersNotFoundException;
import com.codsoft.model.Game;
import com.codsoft.model.Users;
import com.codsoft.repository.GameRepository;
import com.codsoft.repository.UsersRepository;

@Service
public class GameServiceImpl implements GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public List<GameDTO> retriveAllGamesWithUser() throws GameNotFoundException {
		// TODO Auto-generated method stub
		
		List<GameDTO> listGames = gameRepository.findAllGameWithUser();
		
		if(listGames.isEmpty()) {
			throw new GameNotFoundException("To Record exits");
		}
		
		return listGames;
	}

	@Override
	public List<Game> retriveAllGamesUserId(Integer userId) throws GameNotFoundException {
		// TODO Auto-generated method stub

		List<Game> games = gameRepository.getAllGameByUserId(userId);
		
		if(games.isEmpty()) {
			throw new GameNotFoundException("No Game exit in the record of userId "+ userId);
		}
		
		return games;
	}

	@Override
	public Game retriveGameByGameId(Integer gameId) throws GameNotFoundException {
		
		Optional<Game> opt = gameRepository.findById(gameId);
		
		if(!opt.isPresent()) {
			throw new GameNotFoundException("Game is not exist in the record of gameId "+gameId);
		}
		
		return opt.get();
	}

	@Override
	public Game deleteGameByGameId(Integer gameId) throws GameNotFoundException {
		// TODO Auto-generated method stub
		
		Optional<Game> opt = gameRepository.deleteGameByGameId(gameId);
		
		if(!opt.isPresent()) {
			throw new GameNotFoundException("Game is not Exist with gameId " + gameId);
		}
		
		return opt.get();
	}

	@Override
	public Game registerGameByUserId(Game game, Integer userId) throws GameNotFoundException, UsersNotFoundException {
		// TODO Auto-generated method stub
	
		Optional<Users> userOpt = usersRepository.findById(userId);
		
		if(userOpt.isPresent()) {
			throw new UsersNotFoundException("User is not Exist of userId " + userId);
		}
		
		Optional<Game> gameOpt = gameRepository.findById(game.getGameId());
		
		if(gameOpt.isPresent()) {
			throw new GameNotFoundException("With gameId "+ game.getGameId() + "is already exisits");
		}
		
		userOpt.get().getGames().add(game);
		gameRepository.save(game);
		
		return game;
	}

}
