package com.ecommerce.service;
/*Product Backlog Item 72: Design Restful API to get user address from database
 * by Snehal Jagtap
 */

import com.ecommerce.model.UserAddress;

public interface UserAddressGetService {

	// based in id
	public UserAddress getUserAddressById(Integer Id);

}
