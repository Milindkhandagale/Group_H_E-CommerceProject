package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.CartDetails;
import com.ecommerce.service.CartDetailsGetService;
@RestController
public class CartDetailsGetController {
	// Inject service
	@Autowired
	private CartDetailsGetService cartDetailsGetService;

	// Design the restful web service
	@PutMapping("getCartDetails/{id}")
	public ResponseEntity<CartDetails> getCartDetailsById(@PathVariable("id")Integer id) {
		CartDetails cartDetails = cartDetailsGetService.getCartDetailsById(id);
		return ResponseEntity.ok().body(cartDetails);

	}

}
