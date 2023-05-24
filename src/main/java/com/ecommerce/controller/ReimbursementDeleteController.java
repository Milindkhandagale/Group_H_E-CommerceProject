package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ecommerce.service.ReimbursementDeleteService;

public class ReimbursementDeleteController {
	//Inject service here
	@Autowired
	private ReimbursementDeleteService reimbursementDeleteService;
	//Design the Restful web service
	@DeleteMapping("/deleteReimbursement")
	public void deleteReimbursementById(@PathVariable("id")Integer id) {
		reimbursementDeleteService.deleteReimbursement(id);
		
	} 

}
