package org.expandablesupportservices.ecommerceshop.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.expandablesupportservices.ecommerceshop.datatransferobject.UserDTO;
import org.expandablesupportservices.ecommerceshop.models.User;
import org.expandablesupportservices.ecommerceshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllUsers()
	{
		
		Optional<List<User>> userList = userService.getAllUsers();
		if(userList.isPresent())
		{return ResponseEntity.ok(userList);}
		else		
		return  new ResponseEntity<Object>("NO DATA FOUND", HttpStatus.NO_CONTENT);
	}

	
	@GetMapping("/{userId}")
	public Optional<User> getUserById(@PathVariable Long userId)
	{
		return userService.getUserById(userId);
	}
	
	
	
	
	@PostMapping("/create")
	public ResponseEntity<?> createUser(@RequestBody UserDTO userDTO)
	{
		return userService.createUser(userDTO);
	}
	
	

	@PutMapping("/update")
	public UserDTO updateUser(@RequestBody UserDTO userDTO)
	{
		return userService.updateUser(userDTO);
	}
	
	

	@DeleteMapping("/{userId}")
	public Long deleteUserById(@PathVariable Long userId)
	{
		return userService.deleteUserById(userId);
	}
	
	
	
	
	
}
