package com.codsoft.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.codsoft.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{
	
	public Optional<Users> findByEmail(String email);
	
	@Query("select u from users u where u.userId = :userId")
	public Optional<Users> deleteByUserId(@PathVariable Integer userId);
}
