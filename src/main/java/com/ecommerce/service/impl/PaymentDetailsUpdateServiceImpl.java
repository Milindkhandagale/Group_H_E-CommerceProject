package com.ecommerce.service.impl;
/*
 * Task 67 Product Bloklog item 67: Design the Restful web service to Update the payment details for purchasing order from user.
 * By Snehal Jagtap.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.PaymentDetails;
import com.ecommerce.repository.PaymentDetailsUpdateRepository;
import com.ecommerce.service.PaymentDetailsUptateService;

@Service
public class PaymentDetailsUpdateServiceImpl implements PaymentDetailsUptateService {
	// inject repository reference
	@Autowired
	private PaymentDetailsUpdateRepository paymentDetailsUpdateRepository;

	@Override
	public PaymentDetails updatePaymentDetails(PaymentDetails paymentdetails) {
		PaymentDetails paymentDetails2 = paymentDetailsUpdateRepository.findById(paymentdetails.getId()).orElse(null);
		if (paymentDetails2 != null) {
			paymentDetails2.setCardno(paymentdetails.getCardno());
			paymentDetails2.setCvv(paymentdetails.getCvv());
			paymentDetails2.setExmonth(paymentdetails.getExyear());
			paymentDetails2.setExyear(paymentdetails.getExyear());
			paymentDetails2.setNameoncard(paymentdetails.getNameoncard());
			paymentDetails2.setPaymentmethod(paymentdetails.getPaymentmethod());
			paymentDetails2.setPmtdate(paymentdetails.getPmtdate());

			paymentDetailsUpdateRepository.save(paymentdetails);
			return paymentDetails2;

		}

		return null;
	}

}
