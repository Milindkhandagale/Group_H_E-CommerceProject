package com.ecommerce.controller;
/*
 * Task 80 Design the Restful web service to add the order details into database
 * By Pragati Dabhade
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.OrderDetails;
import com.ecommerce.service.OrderDetailsInsertService;

@RestController
public class OrderDetailsInsertController {

	// Inject the service here
	@Autowired
	private OrderDetailsInsertService orderDetailsInsertService;

	// Design Restful web service to save/insert employee data into database.
	@PostMapping("/saveOrderDetails")
	public ResponseEntity<OrderDetails> saveOrderDetails(@RequestBody OrderDetails orderDetails) {
		OrderDetails orderDetails2 = orderDetailsInsertService.saveOrderDetails(orderDetails);
		return ResponseEntity.ok().body(orderDetails2);

	}

}
