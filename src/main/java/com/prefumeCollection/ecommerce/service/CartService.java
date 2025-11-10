package com.prefumeCollection.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prefumeCollection.ecommerce.model.Cart;
import com.prefumeCollection.ecommerce.repository.CartRepository;
@Service
public class CartService {

	@Autowired
	private CartRepository cartRepository;
	
	public Cart addToCart(Cart cart) {
		return cartRepository.save(cart);
	}
	public List<Cart> getCart(int uid){
		return cartRepository.findByUid(uid);
	}
	public void deleteCartItem(int cartid) {
		cartRepository.deleteById(cartid);
	}
    public Cart updateCartItem(int cartId, Cart updatedItem) {
        Cart existing = cartRepository.findById(cartId)
        .orElseThrow(() -> new RuntimeException("Cart item not found"));
        existing.setQuantity(updatedItem.getQuantity());
        return cartRepository.save(existing);
   }
}
