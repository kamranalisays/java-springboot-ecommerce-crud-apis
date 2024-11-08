package org.expandablesupportservices.ecommerceshop.repositories;

import org.expandablesupportservices.ecommerceshop.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryI extends JpaRepository<User, Long> {

}
