package com.ecommerce.service;
/*
 * Task 66-Product Backlog Item 66: Design Restful API to add the payment details 
 * for purchasing order from user.
 * By Pragati Dabade
 */

import com.ecommerce.model.PaymentDetails;

public interface PaymentDetailsAddService {
	public PaymentDetails savePaymentDetails(PaymentDetails paymentDetails);

}
