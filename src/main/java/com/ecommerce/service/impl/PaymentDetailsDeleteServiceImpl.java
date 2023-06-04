package com.ecommerce.service.impl;
/*
 * Task 67 Product Bloklog item 69: Design the Restful web service to Update the
 payment details for purchasing order from user.
 * By Snehal Jagtap.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.repository.PaymentDetailsDeleteRepository;
import com.ecommerce.service.PaymentDetailsDeleteService;

@Service
public class PaymentDetailsDeleteServiceImpl implements PaymentDetailsDeleteService {

	// Inject Ropository reference
	@Autowired
	private PaymentDetailsDeleteRepository paymentDetailsDeleteRepository;

	@Override
	public void deletePaymentDetails(Integer Id) {
		paymentDetailsDeleteRepository.deleteById(Id);

	}

}
