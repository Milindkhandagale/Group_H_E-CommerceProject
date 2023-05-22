package com.ecommerce.repository;
/*Product Backlog Item 73: Design Restful API to delete user address from database
 * by pragati Dabade
 */

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.UserAddress;

@Repository
public interface UserAddressDeleteRepository extends CrudRepository<UserAddress, Serializable> {

}
