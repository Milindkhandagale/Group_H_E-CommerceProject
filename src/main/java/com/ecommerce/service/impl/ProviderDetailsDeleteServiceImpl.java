package com.ecommerce.service.impl;
/*
 * Product Backlog Item 53: Design the Restful web services to get the provider details.
 * By Snehal Jagtap
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.repository.ProviderDetailsDeleteRepository;
import com.ecommerce.service.ProviderDetailsDeleteService;

@Service
public class ProviderDetailsDeleteServiceImpl implements ProviderDetailsDeleteService {
	// Inject Repository reference
	@Autowired
	private ProviderDetailsDeleteRepository providerDetailsDeleteRepository;

	@Override
	public void deleteById(Integer Id) {
		providerDetailsDeleteRepository.deleteById(Id);

	}

}
