package com.ecommerce.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Product;

@Repository
public interface GetProductDetailsRepository extends CrudRepository<Product, Serializable> {
	
	public Product findById(Integer Id);

}
