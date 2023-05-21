package com.ecommerce.service.impl;
/*Product Backlog Item 71: Design Restful API to get user address from database
 * by Snehal Jagtap
 */

import org.springframework.stereotype.Service;

import com.ecommerce.model.UserAddress;
import com.ecommerce.repository.UserAddressAddRepository;
import com.ecommerce.service.UserAddressAddService;

@Service
public class UserAddressAddServiceImpl implements UserAddressAddService {
	// Inject Repository reference
	private UserAddressAddRepository userAddressAddRepository;

	@Override
	public UserAddress saveUserAddress(UserAddress userAddress) {
		UserAddress userAddress2 = userAddressAddRepository.save(userAddress);
		return userAddress2;
	}

}
