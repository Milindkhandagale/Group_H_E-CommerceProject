package com.ecommerce.service.impl;
/*
 * Product Backlog Item 95: Design Restful web services to add
 *  current converter details
 *  Author Snehal Jagtap
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.CurrencyConversion;
import com.ecommerce.repository.CurrencyConversionAddRepository;
import com.ecommerce.service.CurrencyConversionAddService;

@Service
public class CurrencyConversionAddServiceImpl implements CurrencyConversionAddService {
	// Inject Repository reference
	@Autowired
	private CurrencyConversionAddRepository currencyConversionAddRepository;

	@Override
	public CurrencyConversion saveCurrencyConversion(CurrencyConversion currencyConversion) {
		CurrencyConversion currencyConversion2 = currencyConversionAddRepository.save(currencyConversion);

		return currencyConversion2;
	}

}
