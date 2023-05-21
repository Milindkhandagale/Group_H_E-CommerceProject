package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.ProviderDetails;
import com.ecommerce.service.ProviderDetailsAddService;

@RestController
public class ProviderDetailsAddController {
	// Inject the service
	@Autowired
	private ProviderDetailsAddService providerDetailsAddService;

	// Design the Restful web service to save/insert ProviderDetails data into
	// database
	@PostMapping("/addProviderDetails")
	public ResponseEntity<ProviderDetails> saveProviderDetails(@RequestBody ProviderDetails providerDetails) {
		ProviderDetails providerDetails2 = providerDetailsAddService.saveProviderDetails(providerDetails);
		return ResponseEntity.ok().body(providerDetails2);

	}

}
