package com.ecommerce.service;
/*
 * Product Backlog Item 97: Design Restful web services to add
 *  current converter details
 *  Author Snehal Jagtap
 */

import com.ecommerce.model.CurrencyConversion;

public interface CurrencyConversionGetService {
	public CurrencyConversion getCurrencyConversionById(Integer Id);

}
