package com.ecommerce.repository;

/*Design the web services to fetch all the list of user from database.
 * PragatiDabade
 */
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.User;

@Repository
public interface FetchUserRepository extends CrudRepository<User, Serializable> {
	
	public User findById(Integer Id);

}
