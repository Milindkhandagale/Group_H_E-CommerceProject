package com.ecommerce.controller;
/*Product Backlog Item 73: Design Restful API to delete user address from database
 * by pragati Dabade
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.UserAddressDeleteService;

@RestController
public class UserAddressDeleteController {
	// Inject the service
	@Autowired
	private UserAddressDeleteService userAddressDeleteService;

	// Design the Restful web services to delete the data based on id
	@DeleteMapping("/deleteUserAddress/{id}")
	public void deleteUserAddressById(@PathVariable("id") Integer id) {
		// calling the method
		userAddressDeleteService.deleteById(id);
	}

}
