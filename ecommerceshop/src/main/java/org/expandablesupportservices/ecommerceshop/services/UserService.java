package org.expandablesupportservices.ecommerceshop.services;

import java.util.List;

import org.expandablesupportservices.ecommerceshop.models.User;
import org.expandablesupportservices.ecommerceshop.repositories.UserRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepositoryI userRepositoryI;
	
	public List<User> getAllUsers()
	{
		return userRepositoryI.findAll();
	}

}
