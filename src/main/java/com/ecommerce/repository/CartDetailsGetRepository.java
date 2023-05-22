package com.ecommerce.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.CartDetails;

@Repository
public interface CartDetailsGetRepository extends CrudRepository<CartDetails, Serializable> {
	public CartDetails findById(Integer Id);

}
