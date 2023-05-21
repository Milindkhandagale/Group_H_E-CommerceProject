package com.ecommerce.service.impl;
/*Product Backlog Item 73: Design Restful API to delete user address from database
 * by pragati Dabade
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.repository.UserAddressDeleteRepository;
import com.ecommerce.service.UserAddressDeleteService;

@Service
public class UserAddressDeleteServiceImpl implements UserAddressDeleteService {
	// Inject Repository Reference
	@Autowired
	private UserAddressDeleteRepository userAddressDeleteRepository;

	@Override
	public void deleteById(Integer id) {
		userAddressDeleteRepository.deleteById(id);
	}
}
