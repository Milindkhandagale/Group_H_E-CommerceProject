package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.User;
import com.ecommerce.service.AddUserService;

@RestController
public class AddUserController {
	
	@Autowired
	private AddUserService addUserService;
	
	@PostMapping("/saveUser")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		User users = addUserService.saveUser(user);
		return ResponseEntity.ok().body(users);
	}

}
