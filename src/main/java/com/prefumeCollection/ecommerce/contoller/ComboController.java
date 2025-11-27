package com.prefumeCollection.ecommerce.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prefumeCollection.ecommerce.model.Combo;
import com.prefumeCollection.ecommerce.model.Perfume;
import com.prefumeCollection.ecommerce.service.ComboService;

//@CrossOrigin(origins = "http://192.168.43.27:4200")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/combo")
public class ComboController {

	@Autowired 
	private ComboService comboService;
	
	@GetMapping("/getallcombo")
	public List<Combo> getAllPerfume(){
		return comboService.getAllCombo();
	}
	
	@GetMapping("/getcombo/{gender}")
	public List<Combo> getComboGender(@PathVariable String gender) {
		return comboService.getComboGender(gender);
	}
	@GetMapping("/getcomboname/")
	public List<Combo> getComboName(@RequestParam String name){
		return comboService.getComboName(name);
	}
	@GetMapping("/getcombobyid/{cid}")
	public ResponseEntity<Combo> getPerfumeById(@PathVariable int cid){
		return comboService.getComboById(cid)
				.map(ResponseEntity::ok)              // If found → 200 OK
	            .orElseGet(() -> ResponseEntity.notFound().build());  // If not → 404 Not Found
	}
}
