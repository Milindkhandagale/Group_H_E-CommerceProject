package com.ecommerce.controller;
/* Design API to update the user details into database
 * Pragati Dabade*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.User;
import com.ecommerce.service.UserUpadateService;


@RestController
@RequestMapping("/user")
public class UserUpadateController {
	
	@Autowired
	public UserUpadateService userUpadateService;
	
	private User update(@RequestBody User user) {
		User user1 = userUpadateService.updateUser(user);
		return user1;
		
	}
	
	

}
