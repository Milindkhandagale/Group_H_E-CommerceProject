package com.ecommerce.controller;
/*
 * Product Backlog Item 109: Design Restful web services in which user should able to 
 * store many address belongs to one user only
 * Author Snehal Jagtap
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Address;
import com.ecommerce.model.Users;
import com.ecommerce.service.AddressStoreService;
import com.ecommerce.service.UsersStoreService;

@RestController
public class UsersAddressStoreController {
	// inject Users service and AddressService
	@Autowired
	private UsersStoreService usersService;

	@Autowired
	private AddressStoreService addressService;

	// Design the Restful web services to store multiple users with its Address
	@PostMapping("/storeUsersAddress")
	public Address saveUsersAddress(@RequestBody Address address) {
		// Address
		Address address2 = addressService.saveAddress(address);
		// multiple users store get the list
		List<Users> users = address2.getUsersList();
		// for each loop
		for (Users users1 : users) {
			// users table address id set
			users1.setAddressId(address2.getId());
			usersService.saveUsers(users1);
		}
		return address2;

	}

}
