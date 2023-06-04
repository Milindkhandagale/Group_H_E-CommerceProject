package com.ecommerce.repository;
/*
 * Task 67 Product Bloklog item 69: Design the Restful web service to Update the
 payment details for purchasing order from user.
 * By Snehal Jagtap.
 */

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.PaymentDetails;

@Repository
public interface PaymentDetailsDeleteRepository extends CrudRepository<PaymentDetails, Serializable> {

}
