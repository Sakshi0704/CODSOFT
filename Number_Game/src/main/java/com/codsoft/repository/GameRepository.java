package com.codsoft.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.codsoft.model.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
	
//	@Query("select g from game g where userId = :userId ")
//	public List<Game> getAllGameByUserId(@PathVariable Integer userId);
	
}
