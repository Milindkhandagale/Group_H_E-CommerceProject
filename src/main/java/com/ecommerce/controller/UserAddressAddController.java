package com.ecommerce.controller;
/*Product Backlog Item 70: Design Restful API to get user address from database
 * by Snehal Jagtap
 */

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.model.UserAddress;
import com.ecommerce.service.UserAddressAddService;

public class UserAddressAddController {
	// Inject the service hear
	private UserAddressAddService userAddressAddService;

	// Design the Restful web service
	@PostMapping("/addUserAddress")
	public ResponseEntity<UserAddress> saveUserAddress(@RequestBody UserAddress userAddress) {
		UserAddress userAddress2 = userAddressAddService.saveUserAddress(userAddress);
		return ResponseEntity.ok().body(userAddress2);
	}

}
