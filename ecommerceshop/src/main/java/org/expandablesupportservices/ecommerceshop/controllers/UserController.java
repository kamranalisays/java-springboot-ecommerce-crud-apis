package org.expandablesupportservices.ecommerceshop.controllers;

import java.util.List;
import java.util.Optional;

import org.expandablesupportservices.ecommerceshop.datatransferobject.UserDTO;
import org.expandablesupportservices.ecommerceshop.models.User;
import org.expandablesupportservices.ecommerceshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
	public List<User> getAllUsers()
	{
		return userService.getAllUsers();
	}

	
	@GetMapping("/{userId}")
	public Optional<User> getUserById(@PathVariable Long userId)
	{
		return userService.getUserById(userId);
	}
	
	
	
	
	@PostMapping("/create")
	public UserDTO createUser(@RequestBody UserDTO userDTO)
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
