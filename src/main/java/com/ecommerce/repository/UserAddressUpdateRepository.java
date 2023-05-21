package com.ecommerce.repository;
/*Product Backlog Item 71: Design Restful API to update user address from database
 * by milind Khandagle
 */

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.model.UserAddress;

public interface UserAddressUpdateRepository extends CrudRepository<UserAddress, Serializable> {

}
