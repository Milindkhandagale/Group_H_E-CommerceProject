package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.model.BillDetails;
import com.ecommerce.service.BillDetailsAddService;

public class BillDetailsAddController {
	//Inject service 
	@Autowired
	private BillDetailsAddService billDetailsAddService;
	//Design the Restful web service
	@PostMapping("/addBillDetails")
	public ResponseEntity<BillDetails> saveBillDetails(@RequestBody BillDetails billDetails) {
		BillDetails billDetails2=billDetailsAddService.saveBillDetails(billDetails);
		return ResponseEntity.ok().body(billDetails2);
		
	}

}
