package com.ecommerce.service.impl;
/*Design the API to add the product details into database.
 * Pragati Dabade*/
import org.springframework.stereotype.Service;

import com.ecommerce.model.Product;
import com.ecommerce.repository.AddProductDetailsRepository;
import com.ecommerce.service.AddProductDetailsService;

@Service
public class AddProductDetailsServiceImpl implements AddProductDetailsService{
	
	private AddProductDetailsRepository addProductDetailsRepository;

	@Override
	public Product addProduct(Product product) {
		Product product1 = addProductDetailsRepository.save(product);
		return product1;
	}

}
