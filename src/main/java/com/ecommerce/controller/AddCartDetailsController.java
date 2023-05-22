package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Cart;
import com.ecommerce.service.AddCartDetailsService;

@RestController
public class AddCartDetailsController {
	
	@Autowired
	private AddCartDetailsService addCartDetailsService;
	
	@PostMapping("/addCart")
	public ResponseEntity<Cart> saveCart(@RequestBody Cart cart) {
		Cart carts = addCartDetailsService.saveCart(cart);
		return ResponseEntity.ok().body(carts);
		
	}

}
