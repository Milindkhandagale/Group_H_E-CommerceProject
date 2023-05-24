package com.ecommerce.controller;
/*
 * Product Backlog Item 53: Design the Restful web services to get the provider details.
 * By Snehal Jagtap
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.ProviderDetails;
import com.ecommerce.service.ProviderDetailsDeleteService;

@RestController
public class ProviderDetailsDeleteController {
	// Inject service Reference
	@Autowired
	private ProviderDetailsDeleteService providerDetailsDeleteService;

	// Design RestFul Web Service
	@DeleteMapping("/deleteProviderDetais")
	public void deleteProviderDetaildById(@PathVariable("id") Integer id) {
		providerDetailsDeleteService.deleteById(id);

	}

}
