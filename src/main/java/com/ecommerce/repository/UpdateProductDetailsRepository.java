package com.ecommerce.repository;

/*Design the API to update the product details into database
 * Pragati Dabade*/
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.ecommerce.model.Product;

@Repository
public interface UpdateProductDetailsRepository extends CrudRepository<Product, Serializable> {

}
