package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Users;
import com.ecommerce.repository.UsersGetRepository;
import com.ecommerce.service.UsersGetService;

@Service
public class UsersGetServiceImpl implements UsersGetService {
	// Inject UsersGetRepository reference
	@Autowired
	private UsersGetRepository usersGetRepository;

	@Override
	public Users getUsersById(Integer Id) {
		Users users = usersGetRepository.findById(Id);
		return users;
	}

}
