package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.CartDetails;
import com.ecommerce.repository.CartDetailsGetRepository;
import com.ecommerce.service.CartDetailsGetService;

@Service
public class CartDetailsGetServiceImpl implements CartDetailsGetService {
	// inject Repository reference
	@Autowired
	private CartDetailsGetRepository cartDetailsGetRepository;

	@Override
	public CartDetails getCartDetailsById(Integer Id) {
		CartDetails cartDetails = cartDetailsGetRepository.findById(Id);

		return cartDetails;
	}

}
