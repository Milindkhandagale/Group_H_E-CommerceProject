package com.ecommerce.service;
/*
 * Product Backlog Item 53: Design the Restful web services to get the provider details.
 * By Snehal Jagtap
 */

import com.ecommerce.model.ProviderDetails;

public interface ProviderDetailsGetService {
	// based on id
	public ProviderDetails getProviderDetailsById(Integer Id);

}
