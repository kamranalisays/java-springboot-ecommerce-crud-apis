package org.expandablesupportservices.ecommerceshop.controllers;

import java.util.ArrayList;
import java.util.List;

import org.expandablesupportservices.ecommerceshop.models.Order;
import org.expandablesupportservices.ecommerceshop.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

	@Autowired
	OrderService orderService ;
	
	@GetMapping
	public List<Order> getAllOrders()
	{
		return  orderService.getAllOrders();
		
	}
	
	
	@GetMapping
	public ResponseEntity<?>  getOrdersByProductType()
	{
		
		return ResponseEntity.ok(List<Order>);
	}
	
	
	
}
