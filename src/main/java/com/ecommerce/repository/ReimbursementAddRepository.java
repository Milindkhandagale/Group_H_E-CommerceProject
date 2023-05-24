package com.ecommerce.repository;
/*
 * Product Backlog Item 87: Design the Restful web services to add
 *  the reimbursement
 *  Author Snehal Jagtap
 */

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Reimbursement;

@Repository
public interface ReimbursementAddRepository extends CrudRepository<Reimbursement, Serializable> {

}
