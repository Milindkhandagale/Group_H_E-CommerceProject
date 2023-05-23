package com.ecommerce.service.impl;
/*Design the Restful web services to update the bill detailsDesign the Restful web services to update the bill details
 * Pragati Dabade
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Bill;
import com.ecommerce.repository.BillDetailsUpadateRepository;
import com.ecommerce.service.BillDetailsUpdateService;

@Service
public class BillDetailsUpdateServiceImpl implements BillDetailsUpdateService {
	
	@Autowired
	private BillDetailsUpadateRepository billDetailsUpadateRepository;

	@Override
	public Bill updateBill(Bill bill) {
		Bill bil = billDetailsUpadateRepository.findById(bill.getId()).orElse(null);
		if(bil!=null) {
			bil.setBillCode(bill.getBillCode());
			bil.setBillName(bill.getBillName());
			bil.setBillCom(bill.getBillCom());
			bil.setBillNum(bill.getBillNum());
			bil.setMoney(bill.getMoney());
			bil.setProvider(bill.getProvider());
			
			return bil;
			
		}
		return null;
	}

}
