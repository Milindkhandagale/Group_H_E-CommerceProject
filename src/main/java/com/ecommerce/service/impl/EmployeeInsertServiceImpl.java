package com.ecommerce.service.impl;
/*
 * Task 80 Design the Restful web service to add the order details into database
 * By Pragati Dabhade
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Employee;
import com.ecommerce.repository.EmployeeInsertRepository;
import com.ecommerce.service.EmployeeInsertService;

@Service
public class EmployeeInsertServiceImpl implements EmployeeInsertService {
	@Autowired
	private EmployeeInsertRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee emp = employeeRepository.save(employee);
		return null;
	}

}
