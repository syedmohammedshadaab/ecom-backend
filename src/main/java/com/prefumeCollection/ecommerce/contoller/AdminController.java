package com.prefumeCollection.ecommerce.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prefumeCollection.ecommerce.model.Perfume;
import com.prefumeCollection.ecommerce.service.PService;
import java.util.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired 
	 private PService pService;
	
	@PostMapping("/postperfume")
	public List<Perfume> postPerfume(@RequestBody List<Perfume> perfume) {
		return pService.postPerfume(perfume);
	}
}
