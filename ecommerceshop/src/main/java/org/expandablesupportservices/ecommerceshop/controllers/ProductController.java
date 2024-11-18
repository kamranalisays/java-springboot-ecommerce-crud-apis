package org.expandablesupportservices.ecommerceshop.controllers;

import org.expandablesupportservices.ecommerceshop.datatransferobject.ProductDTO;
import org.expandablesupportservices.ecommerceshop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	ProductService productService;


	@GetMapping("/all")
	public ResponseEntity<?> getAllProducts()   {

		return productService.getAllProducts();

	}

	@GetMapping("/id/{productId}")
	public ResponseEntity<?> getProductById(@PathVariable Long productId) {
		return productService.getProductById(productId);

	}

	@PostMapping("/create")
	public ResponseEntity<?> createProduct(@Valid @RequestBody ProductDTO productDTO) {
		return productService.createProduct(productDTO);

	}

	@PutMapping("/update")
	public ResponseEntity<?> updateProduct(@RequestBody ProductDTO productDTO) {
		return productService.updateProduct(productDTO);
	}

	@DeleteMapping("/delete/{productId}")
	public ResponseEntity<?> deleteProductById(@PathVariable Long productId) {
		return productService.deleteProductById(productId);
	}

	@DeleteMapping("/delete/all")
	public ResponseEntity<?> deleteAllProducts() {
		return productService.deleteAllProducts();
	}

	
}
