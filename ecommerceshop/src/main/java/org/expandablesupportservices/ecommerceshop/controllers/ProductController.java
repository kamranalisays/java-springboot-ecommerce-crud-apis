package org.expandablesupportservices.ecommerceshop.controllers;

import java.util.List;

import org.expandablesupportservices.ecommerceshop.models.Product;
import org.expandablesupportservices.ecommerceshop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	
	@Autowired
	ProductService productService;
	
	
	@GetMapping("/all")
	public  List<Product> getAllProduct(){
		
	return	productService.getAllProduct();
	}
	
	

}
