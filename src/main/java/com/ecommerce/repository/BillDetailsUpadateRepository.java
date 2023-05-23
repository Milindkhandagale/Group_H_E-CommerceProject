package com.ecommerce.repository;
/*Design the Restful web services to update the bill detailsDesign the Restful web services to update the bill details
 * Pragati Dabade
 */

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Bill;

@Repository
public interface BillDetailsUpadateRepository extends CrudRepository<Bill , Serializable>{

}
