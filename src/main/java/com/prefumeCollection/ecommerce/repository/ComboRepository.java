package com.prefumeCollection.ecommerce.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prefumeCollection.ecommerce.model.Combo;

@Repository
public interface ComboRepository extends JpaRepository<Combo, Integer>{
	 List<Combo> findByGender(String gender);
	 List<Combo> findByNameContainingIgnoreCase(String name);
	 Optional<Combo> findByCid(int cid);
}
