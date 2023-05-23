package com.ecommerce.controller;
/*
 * Task 81 Design the Restful web service to Update the order details into database
 * By Snehal Jagtap
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.OrderDetails;
import com.ecommerce.service.OrderDetailsUpdateService;

@RestController
public class OrderDetailsUpdateController {
	// Inject the service here
	@Autowired
	private OrderDetailsUpdateService orderDetailsUpdateService ;

	// Design the Restful web service to save employee data into database
	@PutMapping("/update")
	private OrderDetails update(@RequestBody OrderDetails orderDetails) {

		OrderDetails orderDetails2 = orderDetailsUpdateService.updateOrderDetails(orderDetails);
		return orderDetails2;

	}

}
