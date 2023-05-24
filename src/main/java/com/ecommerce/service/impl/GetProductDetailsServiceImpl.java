package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Product;
import com.ecommerce.repository.GetProductDetailsRepository;
import com.ecommerce.service.GetProductDetailsService;

@Service
public class GetProductDetailsServiceImpl implements GetProductDetailsService{
	
	@Autowired
	private GetProductDetailsRepository getProductDetailsRepository;

	@Override
	public Product getProductById(Integer Id) {
		Product product1 = getProductDetailsRepository.findById(Id);
		return product1;
	}

}
