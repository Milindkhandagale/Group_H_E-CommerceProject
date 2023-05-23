package com.ecommerce.controller;
/* 
 * Task 82 Design the Restful web service to delete the order details into database 
 *  By Milind Khandagale
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.OrderDetailsDeleteService;

@RestController
public class OrderDetailsDeleteController {
	// inject the service
	@Autowired
	private OrderDetailsDeleteService orderDetailsDeleteService;

	// Design Restful web services to delete the data based on id
	@DeleteMapping("/delete/{id}")
	public void deleteEmployeeById(@PathVariable("id") Integer id) {
		// calling the method
		orderDetailsDeleteService.deleteById(id);// path variable name pass here
	}

}
