package com.ecommerce.repository;
/*Design the Restful web services to add bill details
 * Pragati Dabade*/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Bill;

@Repository
public interface BillAddRepository extends JpaRepository<Bill, Integer>{

}
