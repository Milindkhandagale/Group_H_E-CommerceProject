package com.ecommerce.controller;
/*
 * Product Backlog Item 97: Design Restful web services to add
 *  current converter details
 *  Author Snehal Jagtap
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.CurrencyConversion;
import com.ecommerce.service.CurrencyConversionGetService;

@RestController
public class CurrencyConversionGetController {
	// Inject service here
	@Autowired
	private CurrencyConversionGetService currencyConversionGetService;

	// Design the restful web service
	@GetMapping("/getCurrencyConversion")
	public ResponseEntity<CurrencyConversion> getCurrencyConversionById(@PathVariable("id") Integer id) {
		CurrencyConversion currencyConversion = currencyConversionGetService.getCurrencyConversionById(id);
		return ResponseEntity.ok().body(currencyConversion);

	}

}
