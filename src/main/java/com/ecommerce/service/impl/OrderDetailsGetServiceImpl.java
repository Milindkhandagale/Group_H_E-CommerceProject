package com.ecommerce.service.impl;
/* 
 * Task 83 Design the Restful web service to delete the order details into database 
 *  By Snehal Jagtap
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.OrderDetails;
import com.ecommerce.repository.OrderDetailsGetRepository;
import com.ecommerce.service.OrderDetailsGetService;

@Service
public class OrderDetailsGetServiceImpl implements OrderDetailsGetService {
	// Inject Repository Reference
	@Autowired
	private OrderDetailsGetRepository orderDetailsGetRepository;

	@Override
	public OrderDetails getOrderDetailsById(Integer Id) {
		OrderDetails orderDetails = orderDetailsGetRepository.findById(Id);

		return orderDetails;
	}

}
