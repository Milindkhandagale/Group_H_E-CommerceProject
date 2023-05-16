package com.ecommerce.service;
/*
 * Task 68-Product Backlog Item 68: Design Restful API to get the payment details
 *  for purchasing order from user.
 *  By Milind Khandagale
 */

import com.ecommerce.model.PaymentDetails;

public interface PaymentDetailsGetService {
	//based on id
	public PaymentDetails getPaymentDetails(Integer id);

}
