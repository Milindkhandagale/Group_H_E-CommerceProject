package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ecommerce.model.Reimbursement;
import com.ecommerce.service.ReimbursementGetService;

public class ReimbursementGetController {
	// inject service
	@Autowired
	private ReimbursementGetService reimbursementGetService;

	// Design Restful web service
	@GetMapping("/getReimbursement")
	public ResponseEntity<Reimbursement> getReimbursementById(@PathVariable("id") Integer id) {
		Reimbursement reimbursement = reimbursementGetService.getReimbursementById(id);
		return ResponseEntity.ok().body(reimbursement);

	}

}
