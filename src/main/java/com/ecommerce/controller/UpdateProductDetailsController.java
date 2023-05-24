package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
/*Design the API to update the product details into database
 * Pragati Dabade*/
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Product;
import com.ecommerce.service.UpdateProductDetailsService;

@RestController
@RequestMapping("/product")
public class UpdateProductDetailsController {
	
	@Autowired
	public UpdateProductDetailsService updateProductDetailsService;
	
	private Product update(@RequestBody Product product) {
		Product product1 = updateProductDetailsService.updateProduct(product);
		return product1;
		
		
	}

}
