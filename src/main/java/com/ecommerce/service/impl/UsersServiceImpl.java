package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Users;
import com.ecommerce.repository.UsersRepository;
import com.ecommerce.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	// Inject UsersRepository reference
	@Autowired
	private UsersRepository usersRepository;

	@Override
	public Users saveUsers(Users users) {
		Users users2=usersRepository.save(users);
		return users2;
	}

}
