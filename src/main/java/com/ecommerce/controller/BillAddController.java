package com.ecommerce.controller;
/*Design the Restful web services to add bill details
 * Pragati Dabade*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Bill;
import com.ecommerce.service.BillAddService;

@RestController
public class BillAddController {
	
	@Autowired
	private BillAddService billAddService;
	
	public ResponseEntity<Bill> saveBill(@RequestBody Bill bill) {
		Bill Bill = billAddService.saveBill(bill);
		return ResponseEntity.ok().body(bill);
	}

}
