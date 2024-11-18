package org.expandablesupportservices.ecommerceshop.controllers;

import org.expandablesupportservices.ecommerceshop.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
	

	@Autowired
	PaymentService paymentService;


	@GetMapping("/all")
	public ResponseEntity<?> getAllPayments() throws Exception  {

		return paymentService.getAllPayments();

	}

	@GetMapping("/id/{paymentId}")
	public ResponseEntity<?> getPaymentById(@PathVariable Long paymentId) {
		return paymentService.getPaymentById(paymentId);

	}


}
