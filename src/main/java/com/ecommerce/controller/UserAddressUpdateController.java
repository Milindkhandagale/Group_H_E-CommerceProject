package com.ecommerce.controller;
/*Product Backlog Item 71: Design Restful API to update user address from database
 * by milind Khandagle
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.model.UserAddress;
import com.ecommerce.service.UserAddressUpdateService;

public class UserAddressUpdateController {
	// inject service here
	@Autowired
	private UserAddressUpdateService userAddressUpdateService;

	// Design Restful web service to update the useraddress data into database
	@PutMapping("/putUpdateAddress")
	public ResponseEntity<UserAddress> UpdateUserAddress(@RequestBody UserAddress userAddress) {
		UserAddress userAddress2 = userAddressUpdateService.UpdateUserAddress(userAddress);
		return ResponseEntity.ok().body(userAddress2);

	}

}
