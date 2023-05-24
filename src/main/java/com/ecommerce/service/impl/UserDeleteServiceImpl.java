package com.ecommerce.service.impl;
/*Design the web services to delete the user from database.
 * Pragati Dabade*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.repository.UserDeleteRepository;
import com.ecommerce.service.UserDeleteService;

@Service
public class UserDeleteServiceImpl implements UserDeleteService{
	
	@Autowired
	private UserDeleteRepository userDeleteRepository;

	@Override
	public void deleteUser(Integer id) {
		userDeleteRepository.deleteById(id);
		
	}

}
