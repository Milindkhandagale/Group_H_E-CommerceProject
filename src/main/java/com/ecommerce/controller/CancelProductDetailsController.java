package com.ecommerce.controller;
/*Design the API to cancel the product based on id
 * Pragati Dabade*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.CancelProductDetailsService;

@RestController
@RequestMapping("/product")
public class CancelProductDetailsController {
	
	@Autowired
	private CancelProductDetailsService cancelProductDetailsService;
	
	@DeleteMapping("/delete/{id}")
	public void cancelProductById(@PathVariable("id") Integer id) throws Exception{
		cancelProductDetailsService.deleteProduct(id);
	}

}
