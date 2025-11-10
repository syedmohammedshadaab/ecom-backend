package com.prefumeCollection.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prefumeCollection.ecommerce.model.Perfume;
import java.util.*;
@Repository
public interface PerfumeRepository extends JpaRepository<Perfume, Integer> {
	 List<Perfume> findByGender(String gender);
	 List<Perfume> findByNameContainingIgnoreCase(String name);
}
