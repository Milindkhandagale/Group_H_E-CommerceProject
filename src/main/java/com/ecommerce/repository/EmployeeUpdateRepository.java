package com.ecommerce.repository;
/*
 * Task 81 Design the Restful web service to Update the order details into database
 * By Snehal Jagtap
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Employee;

@Repository
public interface EmployeeUpdateRepository extends CrudRepository<Employee, Integer> {

}
