package com.ecommerce.controller;
/*Design the web services to fetch all the list of user from database.
 * PragatiDabade
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.User;
import com.ecommerce.service.FetchUserService;

/*Design the web services to fetch all the list of user from database.
 * PragatiDabade
 */

@RestController
@RequestMapping("/user")
public class FetchUserController {
	
	@Autowired
	private FetchUserService fetchUserService;
	
	public ResponseEntity<User> getUserById(@PathVariable("id") Integer id){
		User user = fetchUserService.getUserById(id);
		return ResponseEntity.ok().body(user);
	}

}
