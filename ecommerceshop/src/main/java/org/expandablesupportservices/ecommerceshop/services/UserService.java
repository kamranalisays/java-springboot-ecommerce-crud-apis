package org.expandablesupportservices.ecommerceshop.services;

import java.util.List;
import java.util.Optional;

import org.expandablesupportservices.ecommerceshop.datatransferobject.UserDTO;
import org.expandablesupportservices.ecommerceshop.models.Product;
import org.expandablesupportservices.ecommerceshop.models.User;
import org.expandablesupportservices.ecommerceshop.repositories.UserRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	
	public ResponseEntity<?> createUser(UserDTO userDTO)
	{
	
			User user=userRepositoryI.save(new User());
			
		
		
	
		return  new ResponseEntity<UserDTO>(userDTO, null);
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
