package com.ecommerce.service.impl;
/* Design API to update the user details into database
 * Pragati Dabade*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.User;
import com.ecommerce.repository.UserUpdateRepository;
import com.ecommerce.service.UserUpadateService;

@Service
public class UserUpdateServiceImpl implements UserUpadateService {

	@Autowired
	private UserUpdateRepository userUpdateRepository;

	@Override
	public User updateUser(User user) {
		userUpdateRepository.findById(user.getId()).orElse(null);
		if (user != null) {
			user.setUsernames(user.getUsernames());
			user.setRealNames(user.getRealNames());
			user.setPasswords(user.getPasswords());
			user.setGenders(user.getGenders());
			user.setBirthday(user.getBirthday());
			user.setUserTypes(user.getUserTypes());
			return user;
		}
		return null;
	}

}
