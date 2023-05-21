package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.ProviderDetails;
import com.ecommerce.repository.ProviderDetailsGetRepository;
import com.ecommerce.service.ProviderDetailsGetService;

@Service
public class ProviderDetailsGetServiceImpl implements ProviderDetailsGetService {
	// inject repository reference
	@Autowired
	private ProviderDetailsGetRepository providerDetailsGetRepository;

	@Override
	public ProviderDetails getProviderDetailsById(Integer Id) {
		ProviderDetails providerDetails = providerDetailsGetRepository.findById(Id);
		return providerDetails;
	}

}
