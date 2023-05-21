package com.ecommerce.controller;
/*Product Backlog Item 72: Design Restful API to get user address from database
 * by Snehal Jagtap
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.UserAddress;
import com.ecommerce.service.UserAddressGetService;

@RestController
public class UserAddressGetController {
	// inject the service
	@Autowired
	private UserAddressGetService userAddressGetService;

	// Design the restful web service to get the UserAddress data based on id
	@GetMapping("/getUserAddress/{id}")
	public ResponseEntity<UserAddress> getUserAddressById(@PathVariable("id") Integer id) {
		// calling method
		UserAddress userAddress = userAddressGetService.getUserAddressById(id);
		return ResponseEntity.ok().body(userAddress);

	}

}
