package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.PaymentDetails;
import com.ecommerce.repository.PaymentDetailsGetRepository;
import com.ecommerce.service.PaymentDetailsGetService;

@Service
public class PaymentDetailsGetServiceImpl implements PaymentDetailsGetService {
	//Inject repository reference
	@Autowired
	private PaymentDetailsGetRepository paymentDetailsGetRepository;

	@Override
	public PaymentDetails getPaymentDetails(Integer id) {
		PaymentDetails paymentDetails=paymentDetailsGetRepository.findById(id);
		return paymentDetails;
	}

}
