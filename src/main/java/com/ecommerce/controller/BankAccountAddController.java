package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.BankAccount;
import com.ecommerce.service.BankAccountAddService;

@RestController
public class BankAccountAddController {
	// Inject service here
	@Autowired
	private BankAccountAddService bankAccountAddService;

	// Design Restful web service
	public ResponseEntity<BankAccount> saveBankAccount(@RequestBody BankAccount bankAccount) {
		BankAccount bankAccount2 = bankAccountAddService.saveBankAccount(bankAccount);

		return ResponseEntity.ok().body(bankAccount2);

	}

}
