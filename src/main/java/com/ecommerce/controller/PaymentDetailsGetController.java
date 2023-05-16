package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.PaymentDetails;
import com.ecommerce.service.PaymentDetailsGetService;

@RestController
public class PaymentDetailsGetController {
	// Inject the service
	@Autowired
	private PaymentDetailsGetService paymentDetailsGetService;

	// Design the Restful web service to get the paymentDetails data based on id
	@GetMapping("/getPaymentDetails/{id}")
	public ResponseEntity<PaymentDetails> getPaymentDetails(@PathVariable("id") Integer id) {
		// calling method
		PaymentDetails paymentDetails = paymentDetailsGetService.getPaymentDetails(id);
		return ResponseEntity.ok().body(paymentDetails);

	}

}
