package com.ecommerce.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Bill;


@Repository
public interface BillgetRepository extends CrudRepository<Bill, Serializable>{
	public Bill findById(Integer Id);

}
