package com.ecommerce.service.impl;
/* 
 * Task 82 Design the Restful web service to delete the order details into database 
 *  By Milind Khandagale
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.repository.OrderDetailsDeleteRespository;
import com.ecommerce.service.OrderDetailsDeleteService;

@Service
public class OrderDetailsDeleteServiceImpl implements OrderDetailsDeleteService {

	// inject the repository reference
	@Autowired
	private OrderDetailsDeleteRespository orderDetailsDeleteRespository ;

	@Override
	public void deleteById(Integer Id) {
		orderDetailsDeleteRespository.deleteById(Id);

	}

}
