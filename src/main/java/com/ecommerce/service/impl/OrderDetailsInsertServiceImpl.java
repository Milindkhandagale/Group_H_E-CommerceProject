package com.ecommerce.service.impl;
/*
 * Task 80 Design the Restful web service to add the order details into database
 * By Pragati Dabhade
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.OrderDetails;
import com.ecommerce.repository.OrderDetailsInsertRepository;
import com.ecommerce.service.OrderDetailsInsertService;

@Service
public class OrderDetailsInsertServiceImpl implements OrderDetailsInsertService {
	@Autowired
	private OrderDetailsInsertRepository oderDetailsInsertRepository;

	@Override
	public OrderDetails saveOrderDetails(OrderDetails orderDetails) {
		OrderDetails orderDetails2 = oderDetailsInsertRepository.save(orderDetails);
		return orderDetails2;
	}

}
