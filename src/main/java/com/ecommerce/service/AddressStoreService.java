package com.ecommerce.service;
/*
 * Product Backlog Item 109: Design Restful web services in which user should able to 
 * store many address belongs to one user only
 * Author Snehal Jagtap
 */


import com.ecommerce.model.Address;

public interface AddressStoreService {
	public Address saveAddress(Address address);

}
