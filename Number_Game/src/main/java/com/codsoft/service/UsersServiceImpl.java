package com.codsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.codsoft.exception.UsersNotFoundException;
import com.codsoft.model.Users;

public class UsersServiceImpl implements UsersService{
	
	@Autowired
	private UsersService userService;

	@Override
	public Users registerUser(Users user) throws UsersNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> retriveAllUsers() throws UsersNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users retriveUser(String email) throws UsersNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
