package com.codsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codsoft.model.Game;

public interface GameRepository extends JpaRepository<Game, Integer> {
	
}
