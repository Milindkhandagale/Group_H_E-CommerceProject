package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Reimbursement;
import com.ecommerce.service.ReimbursementUpdateService;

@RestController
public class ReimbursementUpdateController {
	// Inject service here
	@Autowired
	private ReimbursementUpdateService reimbursementUpdateService;

//Design Restful web service
	@PutMapping("/updateReimbursement")
	public ResponseEntity<Reimbursement> updateReimbursement(@RequestBody Reimbursement reimbursement) {
		Reimbursement reimbursement2 = reimbursementUpdateService.updateReimbursement(reimbursement);
		return ResponseEntity.ok().body(reimbursement2);

	}

}
