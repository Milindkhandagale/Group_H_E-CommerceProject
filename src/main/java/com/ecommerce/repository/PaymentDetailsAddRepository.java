package com.ecommerce.repository;
/*
 * Task 67 Product Bloklog item 67: Design the Restful web service to Update the
 payment details for purchasing order from user.
 * By Snehal Jagtap.
 */


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.PaymentDetails;

@Repository
public interface PaymentDetailsAddRepository extends JpaRepository<PaymentDetails, Integer> {

}
