package org.expandablesupportservices.ecommerceshop.services;

import java.util.ArrayList;
import java.util.List;

import org.expandablesupportservices.ecommerceshop.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	
	public List<User> getAllUsers()
	{
		return new ArrayList<User>();
	}

}
