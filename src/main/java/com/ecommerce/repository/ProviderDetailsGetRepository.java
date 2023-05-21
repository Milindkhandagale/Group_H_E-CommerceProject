package com.ecommerce.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.ProviderDetails;
@Repository
public interface ProviderDetailsGetRepository extends CrudRepository<ProviderDetails,Serializable> {
	public ProviderDetails findById(Integer Id);

}
