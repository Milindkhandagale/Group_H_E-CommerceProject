package com.ecommerce.service.impl;
/* 
 * Task 82 Design the Restful web service to delete the order details into database 
 *  By Milind Khandagale
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.repository.EmployeeDeleteRespository;
import com.ecommerce.service.EmployeeDeleteService;

@Service
public class EmployeeDeleteServiceImpl implements EmployeeDeleteService {

	// inject the repository reference
	@Autowired
	private EmployeeDeleteRespository employeeRespository;

	@Override
	public void deleteById(Integer id) {
		employeeRespository.deleteById(id);

	}

}
