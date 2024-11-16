package org.expandablesupportservices.ecommerceshop.repositories;

import org.expandablesupportservices.ecommerceshop.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoryI extends JpaRepository<Product, Long> {

}
