package com.ecommerce.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Users;
@Repository
public interface UsersGetRepository extends CrudRepository<Users,Serializable> {
	public Users findById(Integer Id);

}
