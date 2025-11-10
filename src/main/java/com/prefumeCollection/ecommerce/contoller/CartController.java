package com.prefumeCollection.ecommerce.contoller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prefumeCollection.ecommerce.model.Cart;
import com.prefumeCollection.ecommerce.repository.CartRepository;
import com.prefumeCollection.ecommerce.service.CartService;
import com.prefumeCollection.ecommerce.service.PService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/cart")
@RestController
public class CartController {

	@Autowired
    private CartRepository cartRepo;
	
	@Autowired
	private PService pService;
	
	@Autowired
	private CartService cartService;

    @PostMapping("/addtocart")
    public ResponseEntity<?> addToCart(@RequestBody Cart cart) {
        try {
            System.out.println("🛒 Received cart: " + cart);
            Cart savedCart = cartRepo.save(cart);
            return ResponseEntity.ok(savedCart);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error saving cart: " + e.getMessage());
        }
    }
    @GetMapping("/getcart/{uid}")
    public List<Cart> getCart(@PathVariable int uid){
    	return cartService.getCart(uid);
    }
    @DeleteMapping("/deletecart/{cartid}")
    public ResponseEntity<Map<String, String>> deleteCart(@PathVariable int cartid) {
        cartService.deleteCartItem(cartid);

        Map<String, String> response = new HashMap<>();
        response.put("message", "Item deleted successfully");

        return ResponseEntity.ok(response);
    }
    
    @PutMapping("/putcart/{cartId}")
    public ResponseEntity<Cart> updateCartItem(@PathVariable int cartId, @RequestBody Cart cart) {
        Cart updated = cartService.updateCartItem(cartId, cart);
        return ResponseEntity.ok(updated);
   }
	
}
