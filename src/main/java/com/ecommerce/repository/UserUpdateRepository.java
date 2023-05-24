package com.ecommerce.repository;
/* Design API to update the user details into database
 * Pragati Dabade*/
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.User;

@Repository
public interface UserUpdateRepository extends CrudRepository<User, Serializable>{

}
