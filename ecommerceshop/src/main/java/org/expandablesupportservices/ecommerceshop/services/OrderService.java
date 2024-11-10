package org.expandablesupportservices.ecommerceshop.services;

import java.util.List;
import java.util.Optional;

import org.expandablesupportservices.ecommerceshop.models.Order;
import org.expandablesupportservices.ecommerceshop.repositories.OrderRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	
	@Autowired
	OrderRepositoryI orderRepositoryI;
	
	
	public List<Order> getAllOrders(){
		
		return orderRepositoryI.findAll();
		
	}

	
	public Optional<Order> getOrderById(Long id)
	{
		return orderRepositoryI.findById(id);
	}
	
}
