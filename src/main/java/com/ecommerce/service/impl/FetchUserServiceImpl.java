package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.User;
import com.ecommerce.repository.FetchUserRepository;
import com.ecommerce.service.FetchUserService;

/*Design the web services to fetch all the list of user from database.
 * PragatiDabade
 */
@Service
public class FetchUserServiceImpl implements FetchUserService{
	
	@Autowired
	private FetchUserRepository fetchUserRepository;

	@Override
	public User getUserById(Integer Id) {
		User user = fetchUserRepository.findById(Id);
		return user;
	}

}
