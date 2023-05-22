package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Address;
import com.ecommerce.repository.AddressRepository;
import com.ecommerce.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	// inject AddressRepository reference
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address saveAddress(Address address) {
		Address address2 = addressRepository.save(address);

		return address2;
	}

}
