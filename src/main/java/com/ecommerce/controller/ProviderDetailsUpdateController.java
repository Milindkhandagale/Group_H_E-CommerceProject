package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.PaymentDetails;
import com.ecommerce.model.ProviderDetails;
import com.ecommerce.service.ProviderDetailsUpdateService;

@RestController
public class ProviderDetailsUpdateController {
	// inject the service here
	@Autowired
	private ProviderDetailsUpdateService providerDetailsUpdateService;
	
	@PutMapping("/updateProviderDetails")

	public ResponseEntity<ProviderDetails> updateProviderDetails(@RequestBody ProviderDetails providerDetails) {
		ProviderDetails providerDetails2 = providerDetailsUpdateService.updateProviderDetails(providerDetails);
		return ResponseEntity.ok().body(providerDetails2);
	}


}
