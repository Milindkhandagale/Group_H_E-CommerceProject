package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Payment;
import com.ecommerce.repository.AddPaymentRepository;
import com.ecommerce.service.AddPaymentService;

@Service
public class AddPaymentServiceImpl implements AddPaymentService{
	@Autowired
	private AddPaymentRepository addPaymentRepository;
	
	@Override
	public Payment savePayment(Payment payment) {
		Payment pay = addPaymentRepository.save(payment);
		return pay;
	}
	
	

}
