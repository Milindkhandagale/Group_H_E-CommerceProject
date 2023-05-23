package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Reimbursement;
import com.ecommerce.repository.ReimbursementGetRepository;
import com.ecommerce.service.ReimbursementGetService;

@Service
public class ReimbursementGetServiceImpl implements ReimbursementGetService {
	// inject Repository reference
	@Autowired
	private ReimbursementGetRepository reimbursementGetRepository;

	@Override
	public Reimbursement getReimbursementById(Integer Id) {
		Reimbursement reimbursement = reimbursementGetRepository.findById(Id);

		return reimbursement;
	}

}
