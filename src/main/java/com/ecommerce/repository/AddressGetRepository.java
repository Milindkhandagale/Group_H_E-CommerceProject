package com.ecommerce.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Address;
@Repository
public interface AddressGetRepository extends CrudRepository<Address,Serializable> {
	public Address findById(Integer Id);

}
