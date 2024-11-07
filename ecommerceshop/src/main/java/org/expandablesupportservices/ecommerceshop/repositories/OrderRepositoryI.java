package org.expandablesupportservices.ecommerceshop.repositories;

import org.expandablesupportservices.ecommerceshop.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepositoryI extends JpaRepository<Order, Long>{

}
