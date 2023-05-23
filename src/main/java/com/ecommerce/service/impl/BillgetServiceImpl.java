package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Bill;
import com.ecommerce.repository.BillgetRepository;
import com.ecommerce.service.BillgetService;

@Service
public class BillgetServiceImpl implements BillgetService{
	
	@Autowired
	private BillgetRepository billgetRepository;
	

	@Override
	public Bill getBillById(Integer Id) {
		Bill bill = billgetRepository.findById(Id);
		return bill;
	}

}
