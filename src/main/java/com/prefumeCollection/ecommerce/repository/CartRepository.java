package com.prefumeCollection.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prefumeCollection.ecommerce.model.Cart;
import java.util.*;
@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

	List<Cart> findByUid(int uid);
   Optional<Cart> findById(int id);
	
}
