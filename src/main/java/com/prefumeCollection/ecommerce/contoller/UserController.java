package com.prefumeCollection.ecommerce.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prefumeCollection.ecommerce.model.Cart;
import com.prefumeCollection.ecommerce.model.User;
import com.prefumeCollection.ecommerce.repository.CartRepository;
import com.prefumeCollection.ecommerce.service.CartService;
import com.prefumeCollection.ecommerce.service.UserService;

@CrossOrigin(origins = "http://192.168.43.27:4200")
//@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	CartService cartService;
	
	@PostMapping("/postuser")
	public ResponseEntity<?> addUser(@RequestBody User user) {
	    // Check if user with this email already exists
	    User existingUser = userService.findByEmail(user.getEmail());

	    if (existingUser != null) {
	        return ResponseEntity
	                .status(HttpStatus.CONFLICT) // 409 Conflict
	                .body("Email already exists! Please use another email.");
	    }

	    User savedUser = userService.postUser(user);
	    return ResponseEntity.ok(savedUser);
	}
	
	@PostMapping("/loginuser")
	public ResponseEntity<?> loginUser(@RequestBody User user) {
	    User existingUser = userService.getUser(user.getEmail(), user.getPassword());

	    if (existingUser != null) {
	        // Create a structured JSON response
	        Map<String, Object> response = new HashMap<>();
	        response.put("uid", existingUser.getUid());
	        response.put("name", existingUser.getName());
	        response.put("email", existingUser.getEmail());
	        response.put("message", "Login successful!");

	        return ResponseEntity.ok(response);
	    } else {
	        // Return error message with status 401 (Unauthorized)
	        Map<String, String> error = new HashMap<>();
	        error.put("error", "Invalid email or password!");
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(error);
	    }
	}	 
}
