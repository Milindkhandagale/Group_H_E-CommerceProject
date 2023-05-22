package com.ecommerce.repository;
/*Product Backlog Item 72: Design Restful API to get user address from database
 * by Snehal Jagtap
 */

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.UserAddress;

@Repository
public interface UserAddressGetRepository extends CrudRepository<UserAddress, Serializable> {
	public UserAddress findById(Integer Id);

}
