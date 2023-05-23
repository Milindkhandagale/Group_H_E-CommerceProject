package com.ecommerce.service.impl;
/*
 * Product Backlog Item 109: Design Restful web services in which user should able to 
 * store many address belongs to one user only
 * Author Snehal Jagtap
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Address;
import com.ecommerce.repository.AddressStoreRepository;
import com.ecommerce.service.AddressStoreService;

@Service
public class AddressStoreServiceImpl implements AddressStoreService {
	// inject AddressRepository reference
	@Autowired
	private AddressStoreRepository addressRepository;

	@Override
	public Address saveAddress(Address address) {
		Address address2 = addressRepository.save(address);

		return address2;
	}

}
