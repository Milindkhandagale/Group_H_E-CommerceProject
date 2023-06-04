package com.ecommerce.repository;
/*
 * Product Backlog Item 53: Design the Restful web services to get the provider details.
 * By Snehal Jagtap
 */

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.ProviderDetails;

@Repository
public interface ProviderDetailsDeleteRepository extends CrudRepository<ProviderDetails, Serializable> {

}
