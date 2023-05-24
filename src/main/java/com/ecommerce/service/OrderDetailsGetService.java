package com.ecommerce.service;
/* 
 * Task 83 Design the Restful web service to delete the order details into database 
 *  By Snehal Jagtap
 */

import com.ecommerce.model.OrderDetails;

public interface OrderDetailsGetService {
	public OrderDetails getOrderDetailsById(Integer Id);

}
