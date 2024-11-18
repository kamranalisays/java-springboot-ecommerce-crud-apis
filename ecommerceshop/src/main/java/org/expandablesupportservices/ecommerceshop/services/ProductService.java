package org.expandablesupportservices.ecommerceshop.services;

import org.expandablesupportservices.ecommerceshop.datatransferobject.ProductDTO;
import org.expandablesupportservices.ecommerceshop.repositories.ProductRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class ProductService {

	@Autowired
	ProductRepositoryI productRepositoryI;

	public ResponseEntity<?> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<?> getProductById(Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<?> createProduct(@Valid ProductDTO productDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<?> updateProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<?> deleteProductById(Long productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<?> deleteAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}


}
