package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.User;

@Repository
public interface AddUserRepository extends JpaRepository<User, Integer>{

}
