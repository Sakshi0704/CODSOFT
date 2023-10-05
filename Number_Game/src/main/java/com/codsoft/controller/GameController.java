package com.codsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codsoft.model.Game;
import com.codsoft.service.GameService;

@RestController
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping("/games")
	public ResponseEntity<List<Game>> retriveAllGames(){
		
		
		//return new ResponseEntity<List<Game>>(null, HttpStatus.OK);
		return null;
	}
	
	@GetMapping("/game")
	public ResponseEntity<Game> retriveGame(@PathVariable Integer gameId){
		
		
		//return new ResponseEntity<Game>(null, HttpStatus.OK);
		return null;
	}
	
}
