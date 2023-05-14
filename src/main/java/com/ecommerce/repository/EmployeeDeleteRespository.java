package com.ecommerce.repository;
/* 
 * Task 82 Design the Restful web service to delete the order details into database 
 *  By Milind Khandagale
 */

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Employee;

@Repository
public interface EmployeeDeleteRespository extends CrudRepository<Employee, Serializable> {

}
