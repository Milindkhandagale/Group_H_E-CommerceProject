package com.ecommerce.service.impl;
/*Product Backlog Item 72: Design Restful API to get user address from database
 * by Snehal Jagtap
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.UserAddress;
import com.ecommerce.repository.UserAddressGetRepository;
import com.ecommerce.service.UserAddressGetService;

@Service
public class UserAddressGetServiceImpl implements UserAddressGetService {

	// Inject Repository Reference
	@Autowired
	private UserAddressGetRepository userAddressGetRepository;

	@Override
	public UserAddress getUserAddressById(Integer Id) {
		UserAddress userAddress = userAddressGetRepository.findById(Id);
		return userAddress;
	}

}
