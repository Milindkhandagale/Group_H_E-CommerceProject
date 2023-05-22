package com.ecommerce.service;
/*Product Backlog Item 71: Design Restful API to update user address from database
 * by milind Khandagle
 */


import com.ecommerce.model.UserAddress;

public interface UserAddressUpdateService {
	
	public UserAddress UpdateUserAddress(UserAddress userAddress);

}
