package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Address;
import com.ecommerce.model.Users;
import com.ecommerce.service.AddressGetService;
import com.ecommerce.service.UsersGetService;

@RestController
public class UsersAddressGetController {
	// inject User UserGetService
	@Autowired
	private UsersGetService usersGetService;
	// inject Address userGetService
	@Autowired
	private AddressGetService addressGetService;
	// Design the Restful web services to store multiple users with its Address
	
		@PostMapping("/storeUsersAddress/{id}")
		
		public ResponseEntity<Users> getUsersById(@PathVariable ("id")Integer id){
			Users users=usersGetService.getUsersById(id);
			return ResponseEntity.ok().body(users);
	}

	

}
