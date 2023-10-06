package com.codsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codsoft.dto.GameDTO;
import com.codsoft.exception.GameNotFoundException;
import com.codsoft.exception.UsersNotFoundException;
import com.codsoft.model.Game;
import com.codsoft.service.GameService;

@RestController
public class GameController {

	
	@Autowired
	private GameService gameService;
	
	
	@PostMapping("/game/{userId}")
	public ResponseEntity<Game> registerGameByUserId(@RequestBody Game game, @PathVariable Integer userId) throws UsersNotFoundException, GameNotFoundException{
	
		
		Game saveGame = gameService.registerGameByUserId(game, userId);
		
		return new ResponseEntity<Game>(saveGame,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/games")
	public ResponseEntity<List<GameDTO>> retriveAllGamesWithUser() throws GameNotFoundException{
		
		List<GameDTO> listGames = gameService.retriveAllGamesWithUser();
		
		return new ResponseEntity<List<GameDTO>>(listGames,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/games/{userId}")
	public ResponseEntity<List<Game>> retriveAllGamesHandler(@PathVariable Integer userId) throws GameNotFoundException{
		
		List<Game> games = gameService.retriveAllGamesUserId(userId);
		
		return new ResponseEntity<List<Game>>(games, HttpStatus.OK);
	}
	
	
	
	@GetMapping("/game/{gameId}")
	public ResponseEntity<Game> retriveGameByIdHandler(@PathVariable Integer gameId) throws GameNotFoundException{
		
		Game game = gameService.retriveGameByGameId(gameId);
		
		return new ResponseEntity<Game>(game, HttpStatus.OK);
	}
	
	
	
}
