package com.ecommerce.controller;
/*
 * Task 80 Design the Restful web service to add the order details into database
 * By Pragati Dabhade
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Employee;
import com.ecommerce.service.EmployeeInsertService;

@RestController
public class EmployeeInsertController {

	// Inject the service here
	@Autowired
	private EmployeeInsertService employeeService;

	// Design Restful web service to save/insert employee data into database.
	@PostMapping("/saveEmployeeData")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		Employee emp = employeeService.saveEmployee(employee);
		return ResponseEntity.ok().body(emp);

	}

}
