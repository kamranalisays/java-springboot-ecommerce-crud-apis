package org.expandablesupportservices.ecommerceshop.controllers;

import org.expandablesupportservices.ecommerceshop.datatransferobject.OrderDTO;
import org.expandablesupportservices.ecommerceshop.response.ApiResponse;
import org.expandablesupportservices.ecommerceshop.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/order")
public class OrderController {

	@Autowired
	OrderService orderService;


	@GetMapping("/all")
	public ResponseEntity<?> getAllOrders() throws Exception  {

		return orderService.getAllOrders();

	}

	@GetMapping("/id/{orderId}")
	public ResponseEntity<?> getOrderById(@PathVariable Long orderId) {
		return orderService.getOrderById(orderId);

	}

	@PostMapping("/submit")
	public ResponseEntity<?> submitOrder(@Valid @RequestBody OrderDTO orderDTO) {
		return orderService.submitOrder(orderDTO);

	}

	@PutMapping("/update")
	public ResponseEntity<?> updateOrder(@Valid @RequestBody OrderDTO orderDTO) {
		return orderService.updateOrder(orderDTO);
	}

	@DeleteMapping("/delete/{orderId}")
	public ResponseEntity<?> deleteOrderById(@PathVariable Long orderId) {
		return orderService.deleteOrderById(orderId);
	}

	@DeleteMapping("/delete/all")
	public ResponseEntity<?> deleteAllOrders() {
		return orderService.deleteAllOrders();
	}


}
