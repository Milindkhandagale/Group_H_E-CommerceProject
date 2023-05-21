package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.ProviderDetails;
import com.ecommerce.service.ProviderDetailsGetService;

@RestController
public class ProviderDetailsGetController {
	// inject the service
	@Autowired
	private ProviderDetailsGetService providerDetailsGetService;

	// Design the Restful web service to get the providerDetails data based on id
	@GetMapping("/getProviderDetails/{id}")
	public ResponseEntity<ProviderDetails> getProviderDetailsById(@PathVariable("id") Integer id) {
		// calling method
		ProviderDetails providerDetails = providerDetailsGetService.getProviderDetailsById(id);
		return ResponseEntity.ok().body(providerDetails);

	}

}
