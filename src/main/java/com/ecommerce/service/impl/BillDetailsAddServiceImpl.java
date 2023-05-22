package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.BillDetails;
import com.ecommerce.repository.BillDetailsAddRepository;
import com.ecommerce.service.BillDetailsAddService;

@Service
public class BillDetailsAddServiceImpl implements BillDetailsAddService {
	// Inject Repository Reference
	@Autowired
	private BillDetailsAddRepository billDetailsAddRepository;

	@Override
	public BillDetails saveBillDetails(BillDetails billDetails) {
		BillDetails billDetails2 = billDetailsAddRepository.save(billDetails);
		return billDetails2;
	}

}
