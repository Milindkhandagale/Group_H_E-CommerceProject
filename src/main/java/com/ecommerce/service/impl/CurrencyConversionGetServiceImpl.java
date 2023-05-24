package com.ecommerce.service.impl;
/*
 * Product Backlog Item 97: Design Restful web services to add
 *  current converter details
 *  Author Snehal Jagtap
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.CurrencyConversion;
import com.ecommerce.repository.CurrencyConversionGetRepository;
import com.ecommerce.service.CurrencyConversionGetService;

@Service
public class CurrencyConversionGetServiceImpl implements CurrencyConversionGetService {
	// Inject Repository referene
	@Autowired
	private CurrencyConversionGetRepository currencyConversionGetRepository;

	@Override
	public CurrencyConversion getCurrencyConversionById(Integer Id) {
		CurrencyConversion currencyConversion = currencyConversionGetRepository.getCurrencyConversionById(Id);

		return currencyConversion;
	}

}
