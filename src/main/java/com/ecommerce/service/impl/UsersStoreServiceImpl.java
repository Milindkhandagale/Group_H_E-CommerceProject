package com.ecommerce.service.impl;
/*
 * Product Backlog Item 109: Design Restful web services in which user should able to 
 * store many address belongs to one user only
 * Author Snehal Jagtap
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Users;
import com.ecommerce.repository.UsersStoreRepository;
import com.ecommerce.service.UsersStoreService;

@Service
public class UsersStoreServiceImpl implements UsersStoreService {
	// Inject UsersRepository reference
	@Autowired
	private UsersStoreRepository usersRepository;

	@Override
	public Users saveUsers(Users users) {
		Users users2=usersRepository.save(users);
		return users2;
	}

}
