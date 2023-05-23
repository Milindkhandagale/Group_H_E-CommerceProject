package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Reimbursement;
import com.ecommerce.service.ReimbursementAddService;

@RestController
public class ReimbursementAddController {
	//inject service here
	@Autowired
	private ReimbursementAddService reimbursementAddService;
	//Design restful web service
	@PostMapping("/addReimbursement")
	public ResponseEntity<Reimbursement> saveReimbursement(@RequestBody Reimbursement reimbursement) {
		Reimbursement reimbursement2=reimbursementAddService.saveReimbursement(reimbursement);
		return ResponseEntity.ok().body(reimbursement2);
	}

	

}
