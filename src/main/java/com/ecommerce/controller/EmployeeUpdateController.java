package com.ecommerce.controller;
/*
 * Task 81 Design the Restful web service to Update the order details into database
 * By Snehal Jagtap
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Employee;
import com.ecommerce.service.EmployeeUpdateService;

@RestController
public class EmployeeUpdateController {
	// Inject the service here
	@Autowired
	private EmployeeUpdateService employeeService;

	// Design the Restful web service to save employee data into database
	@PutMapping("/update")
	private Employee update(@RequestBody Employee employee) {

		Employee emp = employeeService.updateEmployee(employee);
		return emp;

	}

}
