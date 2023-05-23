package com.ecommerce.service.impl;
/*Design the Restful web services to add bill details
 * Pragati Dabade*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Bill;
import com.ecommerce.repository.BillAddRepository;
import com.ecommerce.service.BillAddService;

@Service
public class BillAddServiceImpl implements BillAddService{
	
	@Autowired
	private BillAddRepository billAddRepository;

	@Override
	public Bill saveBill(Bill bill) {
		Bill bil = billAddRepository.save(bill);
		return bil;
	}

}
