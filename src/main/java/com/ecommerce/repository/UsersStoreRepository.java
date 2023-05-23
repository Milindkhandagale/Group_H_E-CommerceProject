package com.ecommerce.repository;
/*
 * Product Backlog Item 109: Design Restful web services in which user should able to 
 * store many address belongs to one user only
 * Author Snehal Jagtap
 */


import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Users;
@Repository
public interface UsersStoreRepository extends CrudRepository<Users,Serializable> {

}
