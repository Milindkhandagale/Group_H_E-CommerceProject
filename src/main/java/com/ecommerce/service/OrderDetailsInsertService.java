package com.ecommerce.service;
/*
 * Task 80 Design the Restful web service to add the order details into database
 * By Pragati Dabhade
 */

import com.ecommerce.model.OrderDetails;

// design service or Design interface
public interface OrderDetailsInsertService {

	public OrderDetails saveOrderDetails(OrderDetails orderDetails);

}
