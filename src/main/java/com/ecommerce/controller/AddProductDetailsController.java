package com.ecommerce.controller;
/*Design the API to add the product details into database.
 * Pragati Dabade*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Product;
import com.ecommerce.service.AddProductDetailsService;

@RestController
@RequestMapping("/product")
public class AddProductDetailsController {
	
	@Autowired
	private AddProductDetailsService addProductDetailsService;
	
	@PostMapping("/AddProduct")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
		Product prodct = addProductDetailsService.addProduct(product);
		return ResponseEntity.ok().body(prodct);
		
		
	}
	

}
