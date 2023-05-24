package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.User;
import com.ecommerce.repository.AddUserRepository;
import com.ecommerce.service.AddUserService;

@Service
public class AddUserServiceImpl implements AddUserService{
	
	@Autowired
	private AddUserRepository addUserRepository;

	@Override
	public User saveUser(User user) {
		User user1 = addUserRepository.save(user);
		return user1;
	}
	

}
