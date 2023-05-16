package com.ecommerce.controller;
/*
 * Task 67 Product Bloklog item 67: Design the Restful web service to Update the
 payment details for purchasing order from user.
 * By Snehal Jagtap.
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.PaymentDetails;
import com.ecommerce.service.PaymentDetailsAddService;

@RestController
public class PaymentDetailsAddController {
	// Inject the service here
	@Autowired
	private PaymentDetailsAddService paymentDetailsAddService;

	// Design Restful web service to save/insert payment details data into database
	@PostMapping("/addPaymentDetails")
	public ResponseEntity<PaymentDetails> savePaymentDetails(@RequestBody PaymentDetails paymentDetails) {
		PaymentDetails paymentDetails2 = paymentDetailsAddService.savePaymentDetails(paymentDetails);
		return ResponseEntity.ok().body(paymentDetails2);

	}
}
