package com.prefumeCollection.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prefumeCollection.ecommerce.model.Perfume;
import com.prefumeCollection.ecommerce.repository.PerfumeRepository;
import java.util.*;

@Service
public class PService {

	@Autowired
	private PerfumeRepository perfumeRepository;
	
	public List<Perfume> getAllPerfume(){
		 return perfumeRepository.findAll();
	}
	public List<Perfume> postPerfume(List<Perfume> perfume){
		return perfumeRepository.saveAll(perfume);
	}
	public List<Perfume> getPerfumeGender(String gender) {
		return perfumeRepository.findByGender(gender);
	}
	public List<Perfume> getPerfumeName(String name){
		return perfumeRepository.findByNameContainingIgnoreCase(name);
	}
	
	
}
