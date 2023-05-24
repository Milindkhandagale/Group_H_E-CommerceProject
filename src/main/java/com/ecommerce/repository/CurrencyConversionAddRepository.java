package com.ecommerce.repository;
/*
 * Product Backlog Item 95: Design Restful web services to add
 *  current converter details
 *  Author Snehal Jagtap
 */

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.CurrencyConversion;

@Repository
public interface CurrencyConversionAddRepository extends CrudRepository<CurrencyConversion, Serializable> {

}
