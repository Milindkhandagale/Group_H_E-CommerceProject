package com.ecommerce.repository;
/*
 * Task 80 Design the Restful web service to add the order details into database
 * By Pragati Dabhade
 */


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Employee;

@Repository
public interface EmployeeInsertRepository extends JpaRepository<Employee, Integer> {

}
