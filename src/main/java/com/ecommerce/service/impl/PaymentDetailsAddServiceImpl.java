package com.ecommerce.service.impl;
/*
 * Task 67 Product Bloklog item 67: Design the Restful web service to Update the
 payment details for purchasing order from user.
 * By Snehal Jagtap.
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.PaymentDetails;
import com.ecommerce.repository.PaymentDetailsAddRepository;
import com.ecommerce.service.PaymentDetailsAddService;

@Service
public class PaymentDetailsAddServiceImpl implements PaymentDetailsAddService {

	// Inject repository reference
	@Autowired
	private PaymentDetailsAddRepository paymentDetailsAddRepository;

	@Override
	public PaymentDetails savePaymentDetails(PaymentDetails paymentDetails) {
		PaymentDetails paymentDetails2=paymentDetailsAddRepository.save(paymentDetails);
		return paymentDetails2;
	}

}
