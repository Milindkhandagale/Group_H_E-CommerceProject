package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Reimbursement;
import com.ecommerce.repository.ReimbursementAddRepository;
import com.ecommerce.service.ReimbursementAddService;
@Service
public class ReimbursementAddServiceImpl implements ReimbursementAddService {
	//inject Repository Reference
	@Autowired
	private ReimbursementAddRepository reimbursementAddRepository;

	@Override
	public Reimbursement saveReimbursement(Reimbursement reimbursement) {
		Reimbursement reimbursement2=reimbursementAddRepository.save(reimbursement);
		return reimbursement2;
	}

}
