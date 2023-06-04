package com.ecommerce.controller;
/* 
 * Task 83 Design the Restful web service to delete the order details into database 
 *  By Snehal Jagtap
 */

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.OrderDetails;
import com.ecommerce.service.OrderDetailsGetService;

@RestController
public class OrderDetailsGetController {
	// Inject service
	private OrderDetailsGetService orderDetailsGetService;

	// Design restful web service
	@GetMapping("/getOrderDetails")
	public ResponseEntity<OrderDetails> getOrderdetailsById(@PathVariable("id") Integer id) {
		OrderDetails orderDetails = orderDetailsGetService.getOrderDetailsById(id);

		return ResponseEntity.ok().body(orderDetails);

	}

}
