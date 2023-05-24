package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Product;
import com.ecommerce.service.GetProductDetailsService;

@RestController
@RequestMapping("/product")
public class GetProductDetailsController {
	
	@Autowired
	private GetProductDetailsService getProductDetailsService;
	
	
	public ResponseEntity<Product> getUserById(@PathVariable("id") Integer id){
		Product prodct = getProductDetailsService.getProductById(id);
		return ResponseEntity.ok().body(prodct);
	}

}
