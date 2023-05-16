package com.ecommerce.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.PaymentDetails;

@Repository
public interface PaymentDetailsGetRepository extends CrudRepository<PaymentDetails, Serializable> {
	public PaymentDetails findById(Integer id);

}
