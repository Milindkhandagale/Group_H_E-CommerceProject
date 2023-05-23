package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.OrderDetails;
import com.ecommerce.repository.OrderDetailsUpdateRepository;
import com.ecommerce.service.OrderDetailsUpdateService;

@Service
public class OrderDetailsUpdateServiceImpl implements OrderDetailsUpdateService {
	@Autowired
	private OrderDetailsUpdateRepository orderDetailsUpdateRepository;

	@Override
	public OrderDetails updateOrderDetails(OrderDetails orderDetails) {
		OrderDetails orderDetails2 = orderDetailsUpdateRepository.findById(orderDetails.getId()).orElse(null);
		if (orderDetails2 != null) {
			orderDetails2.setOrderId(orderDetails.getOrderId());
			orderDetails2.setPrice(orderDetails.getPrice());
			orderDetails2.setProductName(orderDetails.getProductName());
			orderDetails2.setQuantity(orderDetails.getQuantity());
			orderDetails2.setUserId(orderDetails.getOrderId());
			orderDetailsUpdateRepository.save(orderDetails2);
			return orderDetails2;

		}
		return null;
	}

}
