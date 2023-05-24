package com.ecommerce.controller;
/*Design the web services to delete the user from database.
 * Pragati Dabade*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.UserDeleteService;

@RestController
@RequestMapping("/user")
public class UserDeleteController {
	
	@Autowired
	private UserDeleteService userDeleteService;
	
	@DeleteMapping("/delete/{id}")
	public void deleteUserById(@PathVariable("id") Integer id) throws Exception{
		userDeleteService.deleteUser(id);
	}

}
