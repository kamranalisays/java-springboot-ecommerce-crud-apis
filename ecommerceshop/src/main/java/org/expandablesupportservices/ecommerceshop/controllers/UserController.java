package org.expandablesupportservices.ecommerceshop.controllers;

import org.expandablesupportservices.ecommerceshop.datatransferobject.UserDTO;
import org.expandablesupportservices.ecommerceshop.response.ApiResponse;
import org.expandablesupportservices.ecommerceshop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/all")
	public ResponseEntity<?> getAllUsers()  throws Exception  {

		return userService.getAllUsers();

	}

	@GetMapping("/id/{userId}")
	public ResponseEntity<?> getUserById(@PathVariable Long userId) {
		return userService.getUserById(userId);

	}

	@PostMapping("/create")
	public ResponseEntity<?> createUser(@RequestBody UserDTO userDTO) {
		return userService.createUser(userDTO);

	}

	@PutMapping("/update")
	public ResponseEntity<ApiResponse<UserDTO>> updateUser(@RequestBody UserDTO userDTO) {
		return userService.updateUser(userDTO);
	}

	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<ApiResponse<Long>> deleteUserById(@PathVariable Long userId) {
		return userService.deleteUserById(userId);
	}

	@DeleteMapping("/delete/all")
	public ResponseEntity<ApiResponse<String>> deleteAllUsers() {
		return userService.deleteAll();
	}

}
