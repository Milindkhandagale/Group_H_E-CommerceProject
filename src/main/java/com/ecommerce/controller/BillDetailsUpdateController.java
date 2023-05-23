package com.ecommerce.controller;
/*Design the Restful web services to update the bill detailsDesign the Restful web services to update the bill details
 * Pragati Dabade
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Bill;
import com.ecommerce.service.BillDetailsUpdateService;

@RestController
public class BillDetailsUpdateController {
	
	@Autowired
	public BillDetailsUpdateService billDetailsUpdateService;
	
	private Bill update(@RequestBody Bill bill) {
		Bill bills = billDetailsUpdateService.updateBill(bill);
		return bills;
		
	}

}
