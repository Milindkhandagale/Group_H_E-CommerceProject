package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Cart;
import com.ecommerce.repository.AddCartDetailsRepository;
import com.ecommerce.service.AddCartDetailsService;

@Service
public class AddCartDetailsServiceImpl implements AddCartDetailsService{
	
	@Autowired
	private AddCartDetailsRepository addCartDetailsRepository;

	@Override
	public Cart saveCart(Cart cart) {
		Cart carts = addCartDetailsRepository.save(cart);
		return carts;
	}

}
