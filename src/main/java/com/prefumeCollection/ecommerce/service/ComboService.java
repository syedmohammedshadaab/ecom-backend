package com.prefumeCollection.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prefumeCollection.ecommerce.model.Combo;
import com.prefumeCollection.ecommerce.model.Perfume;
import com.prefumeCollection.ecommerce.repository.ComboRepository;

@Service
public class ComboService {

	@Autowired
	ComboRepository comboRepository;
	
	public List<Combo> getAllCombo(){
		 return comboRepository.findAll();
	}
	public List<Combo> postCombo(List<Combo> combo){
		return comboRepository.saveAll(combo);
	}
	public List<Combo> getComboGender(String gender) {
		return comboRepository.findByGender(gender);
	}
	public List<Combo> getComboName(String name){
		return comboRepository.findByNameContainingIgnoreCase(name);
	}
	public Optional<Combo> getComboById(int cid){
	    return comboRepository.findByCid(cid);
	}
}
