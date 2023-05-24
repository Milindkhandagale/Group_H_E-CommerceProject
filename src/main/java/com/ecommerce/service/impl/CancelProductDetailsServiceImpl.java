package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.repository.CancelProductDetailsRepository;
import com.ecommerce.service.CancelProductDetailsService;

/*Design the API to cancel the product based on id
 * Pragati Dabade*/

@Service
public class CancelProductDetailsServiceImpl implements CancelProductDetailsService{
	
	@Autowired
	private CancelProductDetailsRepository cancelProductDetailsRepository;

	@Override
	public void deleteProduct(Integer id) {
		cancelProductDetailsRepository.deleteById(id);
		
	}

}
