package org.expandablesupportservices.ecommerceshop.services;

import java.util.List;
import java.util.Optional;

import org.expandablesupportservices.ecommerceshop.datatransferobject.OrderDTO;
import org.expandablesupportservices.ecommerceshop.models.Order;
import org.expandablesupportservices.ecommerceshop.repositories.OrderRepositoryI;
import org.expandablesupportservices.ecommerceshop.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	
	@Autowired
	OrderRepositoryI orderRepositoryI;
		

	public ResponseEntity<ApiResponse<List<Order>>> getAllOrders() throws Exception {
		
		List<Order> orderList = orderRepositoryI.findAll();
		
		ApiResponse<List<Order>> apiResponse = new ApiResponse<List<Order>>("success", orderList);
		return ResponseEntity.ok(apiResponse);

	}

	public ResponseEntity<ApiResponse<OrderDTO>> getOrderById(Long orderId) {

		Optional<Order> order = orderRepositoryI.findById(orderId);
		OrderDTO orderDTO = new OrderDTO();

		ApiResponse<OrderDTO> apiResponse = new ApiResponse<OrderDTO>("success", orderDTO);
		return ResponseEntity.ok(apiResponse);
	}

	public ResponseEntity<ApiResponse<OrderDTO>> submitOrder(OrderDTO orderDTO) {
		
		
		ApiResponse<OrderDTO> apiResponse = new ApiResponse<OrderDTO>("success", orderDTO);
		return ResponseEntity.ok(apiResponse);
	}

	public ResponseEntity<ApiResponse<OrderDTO>> updateOrder(OrderDTO orderDTO) {

		
		ApiResponse<OrderDTO> apiResponse = new ApiResponse<OrderDTO>("success", orderDTO);
		return ResponseEntity.ok(apiResponse);

	}

	public ResponseEntity<ApiResponse<Long>> deleteOrderById(Long orderId) {

		ApiResponse<Long> apiResponse = new ApiResponse<Long>("success", orderId);
		return ResponseEntity.ok(apiResponse);

	}

	public ResponseEntity<ApiResponse<String>> deleteAllOrders() {

		orderRepositoryI.deleteAll();

		ApiResponse<String> apiResponse = new ApiResponse<String>("success", "");
		return ResponseEntity.ok(apiResponse);
	}

		
}
