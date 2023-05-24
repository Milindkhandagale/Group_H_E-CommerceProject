package com.ecommerce.service;
/*
 * Product Backlog Item 95: Design Restful web services to add
 *  current converter details
 *  Author Snehal Jagtap
 */

import com.ecommerce.model.CurrencyConversion;

public interface CurrencyConversionAddService {
	public CurrencyConversion saveCurrencyConversion(CurrencyConversion currencyConversion);

}
