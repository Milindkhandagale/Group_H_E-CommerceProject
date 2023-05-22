package com.ecommerce.service.impl;
/*Product Backlog Item 71: Design Restful API to update user address from database
 * by milind Khandagle
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Employee;
import com.ecommerce.model.UserAddress;
import com.ecommerce.repository.UserAddressUpdateRepository;
import com.ecommerce.service.UserAddressUpdateService;

@Service
public class UserAddressUpdateServiceImpl implements UserAddressUpdateService {
	// inject Repository reference
	@Autowired
	private UserAddressUpdateRepository userAddressUpdateRepository;

	@Override
	public UserAddress UpdateUserAddress(UserAddress userAddress) {
		UserAddress userAddress2 = userAddressUpdateRepository.findById(userAddress.getId()).orElse(null);
		if (userAddress != null) {
			userAddress2.setCity(userAddress.getCity());
			userAddress2.setCity(userAddress.getState());
			return userAddress2;

		}

		return null;
	}

}
