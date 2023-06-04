package com.ecommerce.controller;
/*
 * Task 67 Product Bloklog item 69: Design the Restful web service to Update the
 payment details for purchasing order from user.
 * By Snehal Jagtap.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.PaymentDetailsDeleteService;

@RestController
public class PaymentDetailsDeleteController {
	// Inject service here
	@Autowired
	private PaymentDetailsDeleteService paymentDetailsDeleteService;

	// Design Restful web service
	@DeleteMapping("/deletePatmentDetails/{id}")
	public void deletePaymentDetails(@PathVariable("id") Integer id) {
		paymentDetailsDeleteService.deletePaymentDetails(id);

	}

}
