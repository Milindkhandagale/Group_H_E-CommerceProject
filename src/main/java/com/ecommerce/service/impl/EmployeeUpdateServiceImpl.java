package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Employee;
import com.ecommerce.repository.EmployeeUpdateRepository;
import com.ecommerce.service.EmployeeUpdateService;

@Service
public class EmployeeUpdateServiceImpl implements EmployeeUpdateService {
	@Autowired
	private EmployeeUpdateRepository employeeUpdateRepository;

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee emp = employeeUpdateRepository.findById(employee.getId()).orElse(null);
		if(emp!=null) {
			emp.setName(employee.getName());
			emp.setCity(employee.getCity());
			return emp;
		}
		
		return null;
	}

}
