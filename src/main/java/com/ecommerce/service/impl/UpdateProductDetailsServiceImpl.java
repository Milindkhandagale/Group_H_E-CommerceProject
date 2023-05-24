package com.ecommerce.service.impl;

/*Design the API to update the product details into database
 * Pragati Dabade*/
import org.springframework.stereotype.Service;

import com.ecommerce.model.Product;
import com.ecommerce.repository.UpdateProductDetailsRepository;
import com.ecommerce.service.UpdateProductDetailsService;

@Service
public class UpdateProductDetailsServiceImpl implements UpdateProductDetailsService {
	
	private UpdateProductDetailsRepository updateProductDetailsRepository;

	@Override
	public Product updateProduct(Product product) {
		updateProductDetailsRepository.findById(product.getId()).orElse(null);
		if(product!=null) {
			product.setCatagories(product.getCatagories());
			product.setBike(product.getBike());
			return product;
		}
		return null;
	}

}
