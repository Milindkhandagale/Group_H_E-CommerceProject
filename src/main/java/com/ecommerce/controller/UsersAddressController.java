package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Address;
import com.ecommerce.model.Users;
import com.ecommerce.service.AddressService;
import com.ecommerce.service.UsersService;

@RestController
public class UsersAddressController {
	// inject Users service and AddressService
	@Autowired
	private UsersService usersService;

	@Autowired
	private AddressService addressService;

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
