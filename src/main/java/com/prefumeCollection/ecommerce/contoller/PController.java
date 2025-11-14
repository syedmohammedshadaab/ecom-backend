package com.prefumeCollection.ecommerce.contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prefumeCollection.ecommerce.model.Perfume;
import com.prefumeCollection.ecommerce.service.PService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/perfume")
public class PController {

	@Autowired 
	private PService pService;
	
	@GetMapping("/getallperfume")
	public List<Perfume> getAllPerfume(){
		return pService.getAllPerfume();
	}
	
	@GetMapping("/getperfume/{gender}")
	public List<Perfume> getPerfumeGender(@PathVariable String gender) {
		return pService.getPerfumeGender(gender);
	}
	@GetMapping("/getperfumename/")
	public List<Perfume> getPerfumeName(@RequestParam String name){
		return pService.getPerfumeName(name);
	}

	@GetMapping("/getperfumebyid/{id}")
	public ResponseEntity<Perfume> getPerfumeById(@PathVariable int id){
		return pService.getPerfumeById(id)
				.map(ResponseEntity::ok)              // If found → 200 OK
	            .orElseGet(() -> ResponseEntity.notFound().build());  // If not → 404 Not Found
	}
}