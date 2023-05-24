package com.ecommerce.service.impl;
/*
 * Product Backlog Item 87: Design the Restful web services to add
 *  the reimbursement
 *  Author Snehal Jagtap
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Reimbursement;
import com.ecommerce.repository.ReimbursementAddRepository;
import com.ecommerce.service.ReimbursementAddService;

@Service
public class ReimbursementAddServiceImpl implements ReimbursementAddService {
	// inject Repository Reference
	@Autowired
	private ReimbursementAddRepository reimbursementAddRepository;

	@Override
	public Reimbursement saveReimbursement(Reimbursement reimbursement) {
		Reimbursement reimbursement2 = reimbursementAddRepository.save(reimbursement);
		return reimbursement2;
	}

}
