package com.ecommerce.repository;
/*
 * Task 81 Design the Restful web service to Update the order details into database
 * By Snehal Jagtap
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.OrderDetails;

@Repository
public interface OrderDetailsUpdateRepository extends CrudRepository<OrderDetails, Integer> {

}
