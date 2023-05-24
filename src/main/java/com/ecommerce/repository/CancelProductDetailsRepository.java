package com.ecommerce.repository;
/*Design the API to cancel the product based on id
 * Pragati Dabade*/
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Product;


@Repository
public interface CancelProductDetailsRepository extends CrudRepository<Product, Integer>{

}
