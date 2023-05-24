package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.BankAccount;
import com.ecommerce.repository.BankAccountAddRepository;
import com.ecommerce.service.BankAccountAddService;

@Service
public class BankAccountAddServiceImpl implements BankAccountAddService {
	// Inject Repository reference
	@Autowired
	private BankAccountAddRepository bankAccountAddRepository;

	@Override
	public BankAccount saveBankAccount(BankAccount bankAccount) {
		BankAccount bankAccount2 = bankAccountAddRepository.save(bankAccount);

		return bankAccount2;
	}

}
