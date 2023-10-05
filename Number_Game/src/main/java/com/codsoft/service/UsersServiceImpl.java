package com.codsoft.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codsoft.exception.UsersNotFoundException;
import com.codsoft.model.Users;
import com.codsoft.repository.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	private UsersRepository userRepository;

	@Override
	public Users registerUser(Users user) throws UsersNotFoundException {
		// TODO Auto-generated method stub
			Optional<Users> existUser = userRepository.findByEmail(user.getEmail());
			
			if(existUser.isPresent()) {
				throw new UsersNotFoundException("User already exists with this email "+user.getEmail());
			}
			
		    userRepository.save(user);	
			return user;
	}

	@Override
	public List<Users> retriveAllUsers() throws UsersNotFoundException {
		// TODO Auto-generated method stub
			List<Users> users = userRepository.findAll();
		
			if(users.isEmpty()) {
				throw new UsersNotFoundException("There is no user exit in record");
			}
		
		return users;
	}

	@Override
	public Users retriveUser(String email) throws UsersNotFoundException {
		// TODO Auto-generated method stub
		
		Optional<Users> user = userRepository.findByEmail(email);
		if(!user.isPresent()) {
			throw new UsersNotFoundException("User does not exist with this email "+ email);
		}
		
		return user.get();
	}

	@Override
	public Users updateUserDetails(Users user, Integer userId) throws UsersNotFoundException {
		// TODO Auto-generated method stub
		
		Optional<Users> existUser = userRepository.findById(userId);
		
		if(!existUser.isPresent()) {
			throw new UsersNotFoundException("User does not exist with userId "+ userId);
		}
		
		userRepository.save(user);
		
		return user;
	}

	@Override
	public Users deleteUser(Integer userId) throws UsersNotFoundException {
		// TODO Auto-generated method stub
		
		Optional<Users> deleteUser = userRepository.deleteByUserId(userId);
		if(!deleteUser.isPresent()) {
			throw new UsersNotFoundException("User does not exist with userId "+ userId);
		}
		
		return deleteUser.get();
	}

}
