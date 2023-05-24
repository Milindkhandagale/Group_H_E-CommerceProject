package com.ecommerce.repository;
/* 
 * Task 83 Design the Restful web service to delete the order details into database 
 *  By Snehal Jagtap
 */

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.OrderDetails;

@Repository
public interface OrderDetailsGetRepository extends CrudRepository<OrderDetails, Serializable> {
	public OrderDetails findById(Integer Id);

}
