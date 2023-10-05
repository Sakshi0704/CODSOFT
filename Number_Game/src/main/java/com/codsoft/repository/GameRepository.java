package com.codsoft.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.codsoft.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
	
//	@Query("select g from Game g inner join Users u on g.gameId = u.gameId ")
//	public List<Game> getAllGameByUserId(Integer userId);
	
}
