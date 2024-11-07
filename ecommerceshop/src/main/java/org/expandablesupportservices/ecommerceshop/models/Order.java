package org.expandablesupportservices.ecommerceshop.models;

import jakarta.persistence.*;


@Entity
@Table( name = "order")
public class Order {
	
	   	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;


	

}
