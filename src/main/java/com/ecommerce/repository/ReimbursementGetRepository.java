package com.ecommerce.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Reimbursement;
@Repository
public interface ReimbursementGetRepository extends CrudRepository<Reimbursement,Serializable> {
	public Reimbursement findById(Integer Id);

}
