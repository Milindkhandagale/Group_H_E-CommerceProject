package com.ecommerce.repository;
/*Design the web services to delete the user from database.
 * Pragati Dabade*/
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.User;

@Repository
public interface UserDeleteRepository extends CrudRepository<User, Serializable>{

}
