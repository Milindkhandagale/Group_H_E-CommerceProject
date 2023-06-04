package com.ecommerce.service.impl;

import org.springframework.stereotype.Service;

import com.ecommerce.model.Reimbursement;
import com.ecommerce.repository.ReimbursementUpdateRepository;
import com.ecommerce.service.ReimbursementUpdateService;
@Service
public class ReimbursementUpdateServiceImpl implements ReimbursementUpdateService {
	//Inject Repository here 
	private ReimbursementUpdateRepository reimbursementUpdateRepository;

	@Override
	public Reimbursement updateReimbursement(Reimbursement reimbursement) {
		Reimbursement reimbursement2=reimbursementUpdateRepository.findById(reimbursement.getId()).orElse(null);
		if(reimbursement2!=null) {
			reimbursement2.setReimbursementId(reimbursement.getReimbursementId());
			reimbursement2.setEmplId(reimbursement.getEmplId());
			reimbursement2.setAmount(reimbursement.getAmount());
			reimbursement2.setStatus(reimbursement.getStatus());
			reimbursement2.setSubmitDate(reimbursement.getSubmitDate());
			reimbursement2.setType(reimbursement.getType());
			return reimbursement2;
		}
		
		return null;
	}
}


