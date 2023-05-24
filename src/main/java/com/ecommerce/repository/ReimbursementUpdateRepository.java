package com.ecommerce.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Reimbursement;
@Repository
public interface ReimbursementUpdateRepository extends CrudRepository<Reimbursement,Serializable> {

}
