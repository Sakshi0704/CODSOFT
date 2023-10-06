package com.codsoft.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.codsoft.dto.GameDTO;
import com.codsoft.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
	
	@Query("select g from Game g where g.user.userId = :userId ")
	public List<Game> getAllGameByUserId(@PathVariable Integer userId);
	
	
	@Query("select g from Game g where g.gameId = :gameId ")
	public Optional<Game> deleteGameByGameId(@PathVariable Integer gameId);
	
	@Query("select u.name, g.take_rounds, g.scores from Users u inner join Game g on u.userId = g.user.userId order by u.name asc ")
	public List<GameDTO> findAllGameWithUser();
	
}
