package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Bill;
import com.ecommerce.service.BillgetService;

@RestController
public class BillgetController {
	
	@Autowired
	private BillgetService billgetService;
	
	@PutMapping("/getBill")
	public ResponseEntity<Bill> getBillById(@PathVariable("id") Integer id){
		Bill bill = billgetService.getBillById(id);
		return ResponseEntity.ok().body(bill);
	}
	

}
