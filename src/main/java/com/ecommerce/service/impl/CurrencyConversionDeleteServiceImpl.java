package com.ecommerce.service.impl;
/*
 * Product Backlog Item 98: Design Restful web services to add
 *  current converter details
 *  Author Snehal Jagtap
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.repository.CurrencyConversionDeleteRepository;
import com.ecommerce.service.CurrencyConversionDeleteService;

@Service
public class CurrencyConversionDeleteServiceImpl implements CurrencyConversionDeleteService {
	// Inject Repository reference
	@Autowired
	private CurrencyConversionDeleteRepository currencyConversionDeleteRepository;

	@Override
	public void deleteCurrencyConversion(Integer Id) {
		currencyConversionDeleteRepository.deleteById(Id);

	}

}
