package com.ecommerce.controller;
/*
 * Product Backlog Item 95: Design Restful web services to add
 *  current converter details
 *  Author Snehal Jagtap
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.model.CurrencyConversion;
import com.ecommerce.service.CurrencyConversionAddService;

public class CurrencyConversionAddController {
	// Inject service here
	@Autowired
	private CurrencyConversionAddService currencyConversionAddService;

	// Design Restful web service

	@PostMapping("/addcurrencyConversion")
	public ResponseEntity<CurrencyConversion> saveCurrencyConversion(
			@RequestBody CurrencyConversion currsaveCurrencyConversion) {

		CurrencyConversion currencyConversion = currencyConversionAddService
				.saveCurrencyConversion(currsaveCurrencyConversion);
		return ResponseEntity.ok().body(currencyConversion);

	}

}
