package com.ecommerce.repository;
/*Design the API to add the product details into database.
 * Pragati Dabade*/
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.model.Product;

public interface AddProductDetailsRepository extends JpaRepository<Product, Integer>{

}
