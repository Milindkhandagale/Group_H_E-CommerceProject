package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Address;
import com.ecommerce.repository.AddressGetRepository;
import com.ecommerce.service.AddressGetService;

@Service
public class AddressGetServiceImpl implements AddressGetService {
	// inject AddressGetRepository Reference
	@Autowired
	private AddressGetRepository addressGetRepository;

	@Override
	public Address getAddressById(Integer Id) {
		Address address = addressGetRepository.findById(Id);

		return address;
	}

}
