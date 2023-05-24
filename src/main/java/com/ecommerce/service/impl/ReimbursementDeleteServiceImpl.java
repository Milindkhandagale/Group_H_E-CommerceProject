package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.repository.ReimbursementDeleteRepository;
import com.ecommerce.service.ReimbursementDeleteService;
@Service
public class ReimbursementDeleteServiceImpl implements ReimbursementDeleteService {
	//Inject Repository reference
	@Autowired
	private ReimbursementDeleteRepository reimbursementDeleteRepository;

	@Override
	public void deleteReimbursement(Integer Id) {
		reimbursementDeleteRepository.deleteById(Id);
		
		
	}
	

}
