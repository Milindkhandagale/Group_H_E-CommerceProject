package com.ecommerce.service;
/*
 * Task 81 Design the Restful web service to Update the order details into database
 * By Snehal Jagtap
 */

import com.ecommerce.model.OrderDetails;

public interface OrderDetailsUpdateService {
	public OrderDetails updateOrderDetails(OrderDetails orderDetails);

}
