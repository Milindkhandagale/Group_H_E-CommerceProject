package com.ecommerce.service.impl;
/*
 * Product Backlog Item 53: Design the Restful web services to get the provider details.
 * By Milind Khandagale
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.ProviderDetails;
import com.ecommerce.repository.ProviderDetailsAddRepository;
import com.ecommerce.service.ProviderDetailsAddService;

@Service
public class ProviderDetailsAddServiceImpl implements ProviderDetailsAddService {
	// Inject Repository reference
	@Autowired
	private ProviderDetailsAddRepository providerDetailsAddRepository;

	@Override
	public ProviderDetails saveProviderDetails(ProviderDetails providerDetails) {
		ProviderDetails providerDetails2=providerDetailsAddRepository.save(providerDetails);

		return providerDetails2;
	}

}
