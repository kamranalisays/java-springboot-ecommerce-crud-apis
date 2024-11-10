package org.expandablesupportservices.ecommerceshop.services;

import java.util.List;
import java.util.Optional;

import org.expandablesupportservices.ecommerceshop.models.Product;
import org.expandablesupportservices.ecommerceshop.repositories.ProductRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductRepositoryI productRepositoryI;
	
	
	public List<Product> getAllProducts()
	{
		
		return productRepositoryI.findAll();
		
	}
	
	
	
	public Optional<Product> getProductById(Long productId)
	{
		
		return productRepositoryI.findById(productId);
		
	}
	
	
	
	
}
