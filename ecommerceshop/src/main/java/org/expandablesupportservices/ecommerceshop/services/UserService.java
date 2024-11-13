package org.expandablesupportservices.ecommerceshop.services;

import java.util.List;
import java.util.Optional;

import org.expandablesupportservices.ecommerceshop.datatransferobject.UserDTO;
import org.expandablesupportservices.ecommerceshop.models.Product;
import org.expandablesupportservices.ecommerceshop.models.User;
import org.expandablesupportservices.ecommerceshop.repositories.UserRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepositoryI userRepositoryI;
	
	public Optional<List<User>> getAllUsers()
	{
		return   Optional.of(userRepositoryI.findAll());
	}
	
	public Optional<User> getUserById(Long userId)
	{
		
		return userRepositoryI.findById(userId);
		
	}
	
	
	public UserDTO createUser(UserDTO userDTO)
	{
			User user=new User();
			
			user.setFirstName(userDTO.getFirstName());
			user.setLastName(userDTO.getLastName());
			user.setEmail(userDTO.getEmail());
			user.setMobileNumber(userDTO.getMobileNumber());
			user.setPassword(userDTO.getPassword());
			user.setUsername(userDTO.getUsername());
	
			 user=userRepositoryI.save(user);
			
			 userDTO.setId(user.getId());
		
	
		return   userDTO ;
	}
	
	
	public UserDTO updateUser(UserDTO userDTO)
	{
		
		userRepositoryI.save(new User());
	
		return  userDTO;
	}
	
	public Long deleteUserById(Long userId)
	{
		
		 userRepositoryI.deleteById(userId);
		 
		 return userId;
		
	}


}
