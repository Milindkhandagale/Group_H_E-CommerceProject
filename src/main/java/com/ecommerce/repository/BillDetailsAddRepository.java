package com.ecommerce.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.BillDetails;
@Repository
public interface BillDetailsAddRepository extends JpaRepository<BillDetails,Integer> {

}
