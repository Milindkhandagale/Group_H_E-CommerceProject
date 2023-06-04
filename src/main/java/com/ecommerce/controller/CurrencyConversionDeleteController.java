package com.ecommerce.controller;
/*
 * Product Backlog Item 98: Design Restful web services to add
 *  current converter details
 *  Author Snehal Jagtap
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.CurrencyConversionDeleteService;

@RestController
public class CurrencyConversionDeleteController {
	@Autowired
	private CurrencyConversionDeleteService currencyConversionDeleteService;

	// Design restful web service
	@DeleteMapping("/deletecurrencyConversion")
	public void deleteCurrencyConversionById(@PathVariable("id") Integer id) {
		currencyConversionDeleteService.deleteCurrencyConversion(id);

	}

}
