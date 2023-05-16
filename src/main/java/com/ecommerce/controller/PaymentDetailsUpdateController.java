package com.ecommerce.controller;
/*
 * Task 67 Product Bloklog item 67: Design the Restful web service to Update the payment details for purchasing order from user.
 * By Snehal Jagtap.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.PaymentDetails;
import com.ecommerce.repository.PaymentDetailsUpdateRepository;
import com.ecommerce.service.PaymentDetailsUptateService;

@RestController
public class PaymentDetailsUpdateController {

	// Inject the service here
	@Autowired
	private PaymentDetailsUptateService paymentDetailsUptateService;
	// Design Restful web service to save the paymentdetails data into database

	@PutMapping("/updatePaymentDetails")

	public ResponseEntity<PaymentDetails> updatePaymentDetails(@RequestBody PaymentDetails paymentDetails) {
		PaymentDetails paymentDetails1 = paymentDetailsUptateService.updatePaymentDetails(paymentDetails);
		return ResponseEntity.ok().body(paymentDetails);
	}

}
