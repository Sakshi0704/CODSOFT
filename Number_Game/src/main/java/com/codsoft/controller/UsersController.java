package com.codsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codsoft.exception.UsersNotFoundException;
import com.codsoft.model.Users;
import com.codsoft.service.UsersService;

@RestController
public class UsersController {

	@Autowired
	private UsersService userService;
	
	@PostMapping("/user")
	public ResponseEntity<Users> registerUserHandler(@RequestBody Users user) throws UsersNotFoundException{
		
		Users saveUser = userService.registerUser(user);
		
		return new ResponseEntity<Users>(saveUser, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/users")
	public ResponseEntity<List<Users>> retriveAllUsersHandler() throws UsersNotFoundException{
		
		List<Users> users = userService.retriveAllUsers();
		
		return new ResponseEntity<List<Users>>(users, HttpStatus.OK);
	}
	
	
	@GetMapping("/user/{email}")
	public ResponseEntity<Users> retriveUserHandler(@PathVariable String email) throws UsersNotFoundException{
		
		Users user = userService.retriveUser(email);
		
		return new ResponseEntity<Users>(user,HttpStatus.OK);
	}
	
	
	@PatchMapping("/user/{userId}")
	public ResponseEntity<Users> updateUserDetailsHandler(@RequestBody Users user , @PathVariable Integer userId) throws UsersNotFoundException{
		
		Users updatedUser = userService.updateUserDetails(user, userId);
		
		return new ResponseEntity<Users>(updatedUser,HttpStatus.ACCEPTED);
	}
	
	
	@DeleteMapping("/user/{userId}")
	public ResponseEntity<Users> deleteUserHandler(@PathVariable Integer userId) throws UsersNotFoundException{
		
		Users deletedUser = userService.deleteUser(userId);
		
		return new ResponseEntity<Users>(deletedUser,HttpStatus.ACCEPTED);
	}
	
}
