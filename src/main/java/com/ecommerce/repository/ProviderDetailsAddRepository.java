package com.ecommerce.repository;
/*
 * Product Backlog Item 53: Design the Restful web services to get the provider details.
 * By Milind Khandagale
 */

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.ProviderDetails;

@Repository
public interface ProviderDetailsAddRepository extends CrudRepository<ProviderDetails, Serializable> {

}
