package com.ecommerce.controller;
/* 
 * Task 82 Design the Restful web service to delete the order details into database 
 *  By Milind Khandagale
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.EmployeeDeleteService;

@RestController
public class EmployeeDeleteController {
	// inject the service
	@Autowired
	private EmployeeDeleteService employeeService;

	// Design Restful web services to delete the data based on id
	@DeleteMapping("/delete/{id}")
	public void deleteEmployeeById(@PathVariable("id") Integer id) {
		// calling the method
		employeeService.deleteById(id);// path variable name pass here
	}

}
