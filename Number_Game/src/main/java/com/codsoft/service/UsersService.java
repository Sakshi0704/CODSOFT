package com.codsoft.service;

import java.util.List;

import com.codsoft.exception.UsersNotFoundException;
import com.codsoft.model.Users;

public interface UsersService {

	public Users registerUser(Users user) throws UsersNotFoundException;
	
	public List<Users> retriveAllUsers() throws UsersNotFoundException;
	
	public Users retriveUser(String email) throws UsersNotFoundException;
	
}
